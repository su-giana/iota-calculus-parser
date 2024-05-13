package iota.emca.predicate;

import org.springframework.stereotype.Component;

@Component
public class IsEqual implements Predicate {
    private  Predicate predicateLeft;
    private  Predicate predicateRight;

    @Override
    public void print() {
        predicateLeft.print();
        predicateRight.print();
    }
}
