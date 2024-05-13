package expression;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IdentifierExpression implements Expression {
    private final String expression;
}
