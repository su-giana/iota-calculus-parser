package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [. ~> Constant]
@AllArgsConstructor
public class EventTo extends EventHandler{
    final private FieldOrTimerSubject fieldOrTimerSubject;
    final private EventConstant eventConstant;
}
