package emca.eventHandler;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [Constant ~> Constant']
@Component
public class EventFromTo implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstantFrom;
    private EventConstant eventConstantTo;
}
