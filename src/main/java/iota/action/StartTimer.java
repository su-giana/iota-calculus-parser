package action;

import expression.Expression;
import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class StartTimer implements Action {
    private final TimerName timerName;
    private final Expression expression;
}
