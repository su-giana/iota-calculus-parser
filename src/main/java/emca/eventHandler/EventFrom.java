package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [. ~> Constant]
@AllArgsConstructor
public class EventFrom {
    final private FieldOrTimerSubject fieldOrTimerSubject;
    final private EventConstant eventConstant;
}
