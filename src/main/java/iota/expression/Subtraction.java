package iota.expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtraction implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
    public boolean sameWith(Expression e) {
        return false;
    }
    public void print() {
        leftExpression.print();
        System.out.println();
        rightExpression.print();
        System.out.println();
    }
}
