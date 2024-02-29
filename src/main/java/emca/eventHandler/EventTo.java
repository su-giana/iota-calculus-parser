package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [. ~> Constant]
@AllArgsConstructor
public class EventTo extends EventHandler{
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;
}
