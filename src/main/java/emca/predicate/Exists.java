package emca.predicate;

import lombok.AllArgsConstructor;
import types.BoundVariable;
import types.Group;

@AllArgsConstructor
public class Exists extends Predicate{
    private final Group group;
    private final BoundVariable boundVariable;
    private final Predicate predicate;
}
