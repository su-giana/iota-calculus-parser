package iota.expression;

import org.springframework.stereotype.Component;
import iota.types.TimerName;

@Component
public class Timer implements Expression {
    private TimerName timerName;
    public boolean sameWith(Expression e) {
        return false;
    }

    @Override
    public void print() {

    }
}
