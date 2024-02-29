package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [Constant ~> Constant']
@AllArgsConstructor
public class EventFromTo {
    final private FieldOrTimerSubject fieldOrTimerSubject;
    final private EventConstant eventConstantFrom;
    final private EventConstant eventConstantTo;
}
