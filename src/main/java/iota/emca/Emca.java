package iota.emca;

import iota.emca.eventHandler.EventHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.MultiplePredicateActions;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Emca {
    private EventHandler eventHandler;
    private MultiplePredicateActions multiplePredicateActions;

    public static Emca fromJson(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(JsonUtil.bodyFromJsonByKey(jsonContext, "EMCA"));
        if (components.size() < 2) {
            throw new IllegalArgumentException("Invalid JSON format");
        }
        return new Emca(components.get(0), components.get(1));
    }

    private Emca(String eventHandler, String multiplePredicateAction) {
        this.eventHandler = EventHandler.fromJson(eventHandler);
        this.multiplePredicateActions = new MultiplePredicateActions(multiplePredicateAction);
    }

    public void print() {
        eventHandler.print();
        System.out.println();
        multiplePredicateActions.print();
        System.out.println();
    }
}
