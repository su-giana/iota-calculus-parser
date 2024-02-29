package decl;

import types.Name;
import types.ValueType;

import java.util.List;

public class OutputDecl extends Decl {
    private List<ValueType> valueTypes;

    public OutputDecl(Name declName, List<ValueType> valueTypes) {
        super(declName);
        this.valueTypes = valueTypes;
    }
}
