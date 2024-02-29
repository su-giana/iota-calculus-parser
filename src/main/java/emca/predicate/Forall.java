package emca.predicate;

import lombok.AllArgsConstructor;
import types.BoundVariable;
import types.Group;

@AllArgsConstructor
public class Forall extends Predicate {
    private final Group group;
    private final BoundVariable boundVariable;
    private final Predicate predicate;
}
