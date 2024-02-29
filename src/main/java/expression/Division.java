package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Division extends Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
}
