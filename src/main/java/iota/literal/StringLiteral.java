package iota.literal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringLiteral implements Literal {
    private final String string;

    @Override
    public void print() {
        System.out.println(string);
    }
}
