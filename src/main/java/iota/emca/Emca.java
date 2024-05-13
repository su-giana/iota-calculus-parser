package emca;

import emca.eventHandler.EventHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import rule.LeafRule;
import types.MultiplePredicateActions;
import util.JsonUtil;

import java.util.List;

@Component
public class Emca {
    private EventHandler eventHandler;
    private MultiplePredicateActions multiplePredicateActions;

    public static Emca fromJson(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        if (components.size() < 2) {
            throw new IllegalArgumentException("Invalid JSON format");
        }
        return new Emca(components.get(0), components.get(1));
    }

    private Emca(String eventHandler, String multiplePredicateAction) {
        this.eventHandler = EventHandler.fromJson(eventHandler);
        this.multiplePredicateActions = new MultiplePredicateActions(multiplePredicateAction);
    }
}
