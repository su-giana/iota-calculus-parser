package iota.emca.eventHandler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.EventConstant;
import iota.types.FieldOrTimerSubject;
import iota.util.JsonUtil;

import java.util.List;

// fOrM [. ~> Constant]
@Component
@RequiredArgsConstructor
public class EventFrom implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;

    public EventFrom(String jsonContext) {
        List<String> fields = JsonUtil.processJsonList(jsonContext);
        this.fieldOrTimerSubject = new FieldOrTimerSubject(fields.get(0));
        this.eventConstant = new EventConstant(fields.get(1));
    }

    @Override
    public void print() {
        fieldOrTimerSubject.print();
        eventConstant.print();
    }
}
