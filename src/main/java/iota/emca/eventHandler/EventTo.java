package iota.emca.eventHandler;

import iota.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.EventConstant;
import iota.types.FieldOrTimerSubject;

import java.util.List;

// fOrM [. ~> Constant]
@Component
@RequiredArgsConstructor
public class EventTo implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;

    public EventTo(String jsonContext) {
        List<String> fields = JsonUtil.processJsonList(jsonContext);
        this.fieldOrTimerSubject = new FieldOrTimerSubject(fields.get(0));
        this.eventConstant = new EventConstant(fields.get(1));
    }

    @Override
    public void print() {
        System.out.println("fOrM [. ~> Constant]");
        fieldOrTimerSubject.print();
        eventConstant.print();
    }
}
