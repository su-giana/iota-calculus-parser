package iota.action;

import lombok.AllArgsConstructor;
import iota.types.BoundVariable;
import iota.types.Group;

@AllArgsConstructor
public class MapAction implements Action {
    private final Group group;
    private final BoundVariable boundVariable;
    private final Action action;

    @Override
    public void print() {

    }
}
