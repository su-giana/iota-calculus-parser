package emca.eventHandler;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.EventConstant;
import types.FieldOrTimerSubject;
import util.JsonUtil;

import java.util.List;

// fOrM [. ~> Constant]
@Component
public class EventFrom implements EventHandler {
    private FieldOrTimerSubject fieldOrTimerSubject;
    private EventConstant eventConstant;

    public EventFrom(String jsonContext) {
        List<String> fields = JsonUtil.processJsonList(jsonContext);
        this.fieldOrTimerSubject = new FieldOrTimerSubject(fields.get(0));
        this.eventConstant = new EventConstant(fields.get(1));
    }
}
