package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreaterThanOrEqualTo extends Predicate {
    private final Predicate predicate;
    private final Expression expression;
}
