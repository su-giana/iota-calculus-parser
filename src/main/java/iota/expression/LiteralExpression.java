package iota.expression;

import iota.literal.Literal;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LiteralExpression implements Expression {
    private Literal literal;
    public LiteralExpression(String jsonContext) {
        this.literal = Literal.fromJson(jsonContext);
    }
    public boolean sameWith(Expression e) {
        return false;
    }

    @Override
    public void print() {
        literal.print();
        System.out.println();
    }
}
