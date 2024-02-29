package expression;

import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class Timer extends Expression {
    private final TimerName timerName;
}
