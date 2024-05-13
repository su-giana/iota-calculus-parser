package iota.types;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MultiplePredicateActions {
    private List<PredicateAction> multiplePredicateActions;

    public MultiplePredicateActions(String jsonContext) {
        List<String> predicateActions = JsonUtil.processJsonList(jsonContext);

        this.multiplePredicateActions = predicateActions.stream()
                .map(predicateActionsJson -> new PredicateAction(predicateActionsJson))
                .toList();
    }

    public void print() {
        multiplePredicateActions.stream()
                .forEach(m -> m.print());
    }
}
