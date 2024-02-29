package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.FieldOrTimerSubject;

// [. ~> ]
@AllArgsConstructor
public class JustEvent extends EventHandler {
    final private FieldOrTimerSubject fieldOrTimerSubject;
}
