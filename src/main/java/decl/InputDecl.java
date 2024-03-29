package decl;

import types.Name;
import types.ValueType;

public class InputDecl extends Decl {
    final private ValueType valueType;

    public InputDecl(Name declName, ValueType valueType) {
        super(declName);
        this.valueType = valueType;
    }
}
