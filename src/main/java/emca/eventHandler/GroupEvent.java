package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.BoundVariable;
import types.Group;

@AllArgsConstructor
public class GroupEvent {
    private Group group;
    private BoundVariable boundVariable;
    private EventHandler eventHandler;
}
