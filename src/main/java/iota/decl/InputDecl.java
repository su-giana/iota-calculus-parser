package decl;

import org.springframework.stereotype.Component;
import types.Name;
import types.ValueType;
import util.JsonUtil;

import java.util.List;

@Component
public class InputDecl implements Decl {
    private Name name;
    private ValueType valueType;
    private String value;

    public InputDecl(String jsonContext) {
        List<String> inputInfo = JsonUtil.processJsonList(jsonContext);
        this.name = new Name(inputInfo.get(0));
        this.valueType = new ValueType(inputInfo.get(1));
        this.value = inputInfo.get(2);
    }
}
