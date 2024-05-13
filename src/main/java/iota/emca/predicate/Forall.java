package emca.predicate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.BoundVariable;
import types.Group;

@Component
public class Forall implements Predicate {
    private  Group group;
    private  BoundVariable boundVariable;
    private  Predicate predicate;
}
