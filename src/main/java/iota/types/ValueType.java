package iota.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValueType {
    final private String valueType;
    public void print() {
        System.out.println(valueType);
    }
}
