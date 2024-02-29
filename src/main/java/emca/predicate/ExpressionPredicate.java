package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExpressionPredicate extends Predicate {
    private final Expression expression;
}
