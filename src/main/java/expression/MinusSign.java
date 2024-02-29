package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MinusSign extends Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
}
