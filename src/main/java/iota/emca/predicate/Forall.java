package iota.emca.predicate;

import org.springframework.stereotype.Component;
import iota.types.BoundVariable;
import iota.types.Group;

@Component
public class Forall implements Predicate {
    private  Group group;
    private  BoundVariable boundVariable;
    private  Predicate predicate;

    @Override
    public void print() {

    }
}
