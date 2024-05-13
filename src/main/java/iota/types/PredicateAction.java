package types;

import emca.predicate.Predicate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import util.JsonUtil;

import java.util.List;

@Component
public class PredicateAction {
    private Predicate predicate;
    private Actions actions;

    public PredicateAction(String jsonContext) {
        List<String> predicateAction = JsonUtil.processJsonList(jsonContext);

        this.predicate = Predicate.fromJson(predicateAction.get(0));
        this.actions = new Actions(predicateAction.get(1));
    }
}
