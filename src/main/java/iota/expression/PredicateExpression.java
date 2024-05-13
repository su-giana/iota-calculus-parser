package expression;

import emca.predicate.Predicate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PredicateExpression extends Expression {
    private final Predicate predicate;
}
