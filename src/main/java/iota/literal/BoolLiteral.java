package iota.literal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BoolLiteral implements Literal {
    private final boolean bool;

    @Override
    public void print() {
        System.out.println("BoolLiteraal : " + bool);
    }
}
