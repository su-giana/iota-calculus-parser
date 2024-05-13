package iota.literal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConstantLiteral implements Literal {
    private final String constant;

    @Override
    public void print() {
        System.out.println("ConstantLiteral : " + constant);
    }
}
