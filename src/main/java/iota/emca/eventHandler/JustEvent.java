package iota.emca.eventHandler;

import lombok.AllArgsConstructor;
import iota.types.FieldOrTimerSubject;

// [. ~> ]
@AllArgsConstructor
public class JustEvent implements EventHandler {
    final private FieldOrTimerSubject fieldOrTimerSubject;

    @Override
    public void print() {
        
    }
}
