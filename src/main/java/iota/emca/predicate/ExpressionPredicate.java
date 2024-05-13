package iota.emca.predicate;

import iota.expression.Expression;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExpressionPredicate implements Predicate {
    private Expression expression;

    public ExpressionPredicate(String jsonContext) {
        this.expression = Expression.fromJson(jsonContext);
    }

    @Override
    public void print() {
        expression.print();
    }
}
