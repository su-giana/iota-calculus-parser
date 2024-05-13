package expression;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.TimerName;

@Component
public class Timer implements Expression {
    private TimerName timerName;
}
