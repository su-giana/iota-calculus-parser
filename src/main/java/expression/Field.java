package expression;

import lombok.AllArgsConstructor;
import types.AttributeName;
import types.DeviceName;

@AllArgsConstructor
public class Field extends Expression {
    private final DeviceName deviceName;
    private final AttributeName attributeName;
}
