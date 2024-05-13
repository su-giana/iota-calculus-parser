package types;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class FieldOrTimerSubject {
    private Expression expression;

    public FieldOrTimerSubject(String jsonContext) {
        this.expression = Expression.fromJson(jsonContext);
    }
}
