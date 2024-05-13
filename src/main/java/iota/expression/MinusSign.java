package iota.expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MinusSign implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
    public boolean sameWith(Expression e) {
        return false;
    }

    @Override
    public void print() {
        leftExpression.print();
        System.out.println();
        rightExpression.print();
        System.out.println();
    }
}
