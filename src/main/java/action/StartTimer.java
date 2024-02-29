package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class StartTimer extends Action {
    private final TimerName timerName;
    private final Expression expression;
}
