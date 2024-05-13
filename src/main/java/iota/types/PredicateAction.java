package iota.types;

import iota.emca.predicate.Predicate;
import iota.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PredicateAction {
    private Predicate predicate;
    private Actions actions;

    public PredicateAction(String jsonContext) {
        List<String> predicateAction = JsonUtil.processJsonList(jsonContext);

        this.predicate = Predicate.fromJson(predicateAction.get(0));
        this.actions = new Actions(predicateAction.get(1));
    }

    public void print() {
        predicate.print();
        actions.print();
    }
}
