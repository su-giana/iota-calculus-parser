package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.FieldOrTimerSubject;

// [. ~> ]
@AllArgsConstructor
public class JustEvent implements EventHandler {
    final private FieldOrTimerSubject fieldOrTimerSubject;
}
