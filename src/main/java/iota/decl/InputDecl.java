package iota.decl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.Name;
import iota.types.ValueType;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InputDecl implements Decl {
    private String name;
    private ValueType valueType;
    private String value;

    public InputDecl(String jsonContext) {
        List<String> inputInfo = JsonUtil.processJsonList(jsonContext);
        this.name = inputInfo.get(0);
        this.valueType = new ValueType(inputInfo.get(1));
        this.value = inputInfo.get(2);
    }

    @Override
    public void print() {
        System.out.println(name);
        valueType.print();
        System.out.println(value);
    }
}
