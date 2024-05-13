package iota.emca.eventHandler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.EventConstant;
import iota.types.FieldOrTimerSubject;

// fOrM [Constant ~> Constant']
@Component
@RequiredArgsConstructor
public class EventFromTo implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstantFrom;
    private EventConstant eventConstantTo;

    public void print() {
        System.out.println("fOrM [Constant ~> Constant']");
        fieldOrTimerSubject.print();
        eventConstantFrom.print();
        eventConstantTo.print();
    }
}
