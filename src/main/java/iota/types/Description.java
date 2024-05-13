package iota.types;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Description {
    final private String description;

    public void print() {
        System.out.println(description);
    }
}
