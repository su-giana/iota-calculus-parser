package iota.literal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NumberLiteral implements Literal {
    private final int number;

    @Override
    public void print() {
        System.out.println("NumberLiteral : " + number);
    }
}
