package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [. ~> Constant]
@AllArgsConstructor
public class EventFrom {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;
}
