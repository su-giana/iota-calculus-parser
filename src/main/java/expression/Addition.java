package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Addition extends Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
}
