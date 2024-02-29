package action;

import lombok.AllArgsConstructor;
import types.BoundVariable;
import types.Group;

@AllArgsConstructor
public class MapAction extends Action {
    private final Group group;
    private final BoundVariable boundVariable;
    private final Action action;
}
