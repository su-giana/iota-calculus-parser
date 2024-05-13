package emca.eventHandler;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [. ~> Constant]
@Component
public class EventTo implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;


}
