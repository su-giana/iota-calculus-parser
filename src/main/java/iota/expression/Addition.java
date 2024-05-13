package expression;

import lombok.AllArgsConstructor;
import util.JsonUtil;

import java.util.List;

public class Addition implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    public Addition(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        this.leftExpression = Expression.fromJson(components.get(0));
        this.rightExpression = Expression.fromJson(components.get(1));
    }
}
