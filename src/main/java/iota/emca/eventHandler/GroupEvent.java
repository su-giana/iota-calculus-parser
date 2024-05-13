package iota.emca.eventHandler;

import lombok.AllArgsConstructor;
import iota.types.BoundVariable;
import iota.types.Group;

@AllArgsConstructor
public class GroupEvent implements EventHandler{
    final private Group group;
    final private BoundVariable boundVariable;
    final private EventHandler eventHandler;


    @Override
    public void print() {

    }
}
