package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Multiplication extends Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
}
