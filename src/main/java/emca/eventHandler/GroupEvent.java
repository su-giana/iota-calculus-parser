package emca.eventHandler;

import lombok.AllArgsConstructor;
import types.BoundVariable;
import types.Group;

@AllArgsConstructor
public class GroupEvent {
    final private Group group;
    final private BoundVariable boundVariable;
    final private EventHandler eventHandler;
}
