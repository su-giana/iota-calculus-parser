package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LessThanOrEqualTo extends Predicate {
    private final Predicate predicate;
    private final Expression expression;
}
