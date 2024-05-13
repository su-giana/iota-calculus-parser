package iota.expression;

import iota.types.Name;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.AttributeName;
import iota.types.DeviceName;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Field implements Expression {
    private String deviceName;
    private String attributeName;

    public Field(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        this.deviceName = components.get(0);
        this.attributeName= components.get(1);
    }

    public boolean sameWith(Expression e) {
        if (e instanceof Field) {
            Field fieldCmp = (Field) e;
            return fieldCmp.sameDeviceName(this.deviceName) && fieldCmp.sameAttributeName(this.attributeName);
        }
        return false;
    }

    public boolean sameDeviceName(String name) {
        return deviceName.equals(name);
    }

    public boolean sameAttributeName(String name) {
        return name.equals(attributeName);
    }

    public void print() {
        System.out.println(deviceName + " " + attributeName);
    }
}
