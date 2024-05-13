package iota.expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdentifierExpression implements Expression {
    private final String expression;
    public boolean sameWith(Expression e) {
        return false;
    }

    public void print() {
        System.out.println(expression);
    }
}
