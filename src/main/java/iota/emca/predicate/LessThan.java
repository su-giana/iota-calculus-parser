package iota.emca.predicate;

import iota.expression.Expression;
import iota.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LessThan implements Predicate {
    private Predicate predicate;
    private Expression expression;

    public LessThan(String jsonContext) {
        List<String> predicateExpression = JsonUtil.processJsonList(jsonContext);
        this.predicate = Predicate.fromJson(predicateExpression.get(0));
        this.expression = Expression.fromJson(predicateExpression.get(1));
    }

    @Override
    public void print() {
        predicate.print();
        expression.print();
    }
}
