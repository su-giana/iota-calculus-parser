package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtraction extends Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;
}
