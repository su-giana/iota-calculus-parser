package types;

import emca.predicate.Predicate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PredicateAction {
    final private Predicate predicate;
    final private Actions actions;
}
