package types;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import util.JsonUtil;

import java.util.List;

@Component
public class MultiplePredicateActions {
    private List<PredicateAction> multiplePredicateActions;

    public MultiplePredicateActions(String jsonContext) {
        List<String> predicateActions = JsonUtil.processJsonList(jsonContext);

        this.multiplePredicateActions = predicateActions.stream()
                .map(predicateActionsJson -> new PredicateAction(predicateActionsJson))
                .toList();
    }
}
