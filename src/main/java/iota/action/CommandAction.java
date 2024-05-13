package iota.action;

import iota.expression.Expression;
import iota.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.FieldOrTimerSubject;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CommandAction implements Action {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private Expression expression;

    public CommandAction(String jsonContext) {
        List<String> targetActions = JsonUtil.processJsonList(jsonContext);
        this.fieldOrTimerSubject = new FieldOrTimerSubject(targetActions.get(0));
        this.expression = Expression.fromJson(targetActions.get(1));
    }

    @Override
    public void print() {
        fieldOrTimerSubject.print();
        expression.print();
    }
}
