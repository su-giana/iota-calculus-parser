package iota.types;

import iota.expression.Expression;
import iota.expression.Field;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FieldOrTimerSubject {
    private Expression expression;

    public FieldOrTimerSubject(String jsonContext) {
        this.expression = Expression.fromJson(jsonContext);
    }

    public void print() {
        expression.print();
    }

    public boolean sameWith(String jsonContext) {
        return this.expression.sameWith(Expression.fromJson(jsonContext));
    }
}
