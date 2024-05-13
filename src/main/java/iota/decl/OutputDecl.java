package iota.decl;

import iota.types.Name;
import iota.types.ValueType;
import iota.util.JsonUtil;

import java.util.List;

public class OutputDecl implements Decl {
    private String outputName;
    private List<ValueType> valueTypes;

    public OutputDecl(String jsonContext) {
        List<String> outputInfo = JsonUtil.processJsonList(jsonContext);
        this.outputName = outputInfo.get(0);
        this.valueTypes = JsonUtil.processJsonList(outputInfo.get(1)).stream()
                .map(output -> new ValueType(output))
                .toList();
    }

    public void print() {
        System.out.println(outputName);
        valueTypes.stream()
                .forEach(type -> type.print());
    }
}
