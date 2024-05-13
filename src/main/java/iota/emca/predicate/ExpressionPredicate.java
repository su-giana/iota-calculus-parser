package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ExpressionPredicate implements Predicate {
    private Expression expression;

    public ExpressionPredicate(String jsonContext) {
        this.expression = Expression.fromJson(jsonContext);
    }
}
