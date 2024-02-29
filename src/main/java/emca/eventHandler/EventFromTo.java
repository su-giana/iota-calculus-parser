package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.EventConstant;
import types.FieldOrTimerSubject;

// fOrM [Constant ~> Constant']
@AllArgsConstructor
public class EventFromTo {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstantFrom;
    private EventConstant eventConstantTo;
}
