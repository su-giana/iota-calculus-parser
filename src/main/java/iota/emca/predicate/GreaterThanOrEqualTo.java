package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import util.JsonUtil;

import java.util.List;

@Component
public class GreaterThanOrEqualTo implements Predicate {
    private  Predicate predicate;
    private  Expression expression;

    public GreaterThanOrEqualTo(String jsonContext) {
        List<String> predicateExpression = JsonUtil.processJsonList(jsonContext);

        this.predicate = Predicate.fromJson(predicateExpression.get(0));
        this.expression = Expression.fromJson(predicateExpression.get(1));
    }
}
