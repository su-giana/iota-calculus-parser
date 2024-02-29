package expression;

import literal.Literal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LiteralExpression extends Expression {
    private final Literal literal;
}
