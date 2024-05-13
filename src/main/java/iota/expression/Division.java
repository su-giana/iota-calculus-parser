package iota.expression;

import iota.util.JsonUtil;

import java.util.List;

public class Division implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Division(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        this.leftExpression = Expression.fromJson(components.get(0));
        this.rightExpression = Expression.fromJson(components.get(1));
    }

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
