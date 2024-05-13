package expression;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.AttributeName;
import types.DeviceName;
import util.JsonUtil;

import java.util.List;

@Component
public class Field implements Expression {
    private DeviceName deviceName;
    private AttributeName attributeName;

    public Field(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        this.deviceName = new DeviceName(components.get(0));
        this.attributeName= new AttributeName(components.get(1));
    }
}
