package iota.action;

import iota.expression.Expression;
import lombok.AllArgsConstructor;
import iota.types.TimerName;

@AllArgsConstructor
public class StartTimer implements Action {
    private final TimerName timerName;
    private final Expression expression;

    @Override
    public void print() {

    }
}
