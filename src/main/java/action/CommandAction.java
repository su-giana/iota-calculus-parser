package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import types.FieldOrTimerSubject;

@AllArgsConstructor
public class CommandAction extends Action {
    private final FieldOrTimerSubject fieldOrTimerSubject;
    private final Expression expression;
}
