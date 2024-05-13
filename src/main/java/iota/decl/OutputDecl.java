package decl;

import types.Name;
import types.ValueType;
import util.JsonUtil;

import java.util.List;

public class OutputDecl implements Decl {
    private Name outputName;
    private List<ValueType> valueTypes;
    private List<String> values;

    public OutputDecl(String jsonContext) {
        List<String> outputInfo = JsonUtil.processJsonList(jsonContext);
        this.outputName = new Name(outputInfo.get(0));
        this.valueTypes = JsonUtil.processJsonList(outputInfo.get(1)).stream()
                .map(output -> new ValueType(output))
                .toList();
        this.values = JsonUtil.processJsonList(outputInfo.get(2)).stream()
                .toList();
    }
}
