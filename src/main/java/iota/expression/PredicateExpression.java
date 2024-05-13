package iota.expression;

import iota.emca.predicate.Predicate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PredicateExpression implements Expression {
    private final Predicate predicate;
    public boolean sameWith(Expression e) {
        return false;
    }

    public void print() {
    }
}
