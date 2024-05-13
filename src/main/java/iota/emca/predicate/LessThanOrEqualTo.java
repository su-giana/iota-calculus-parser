package iota.emca.predicate;

import iota.expression.Expression;
import org.springframework.stereotype.Component;

@Component
public class LessThanOrEqualTo implements Predicate {
    private Predicate predicate;
    private Expression expression;

    @Override
    public void print() {

    }
}
