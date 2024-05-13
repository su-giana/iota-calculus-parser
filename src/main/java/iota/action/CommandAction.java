package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.FieldOrTimerSubject;

@Component
public class CommandAction implements Action {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private Expression expression;

    public CommandAction(String jsonContext) {

    }
}
