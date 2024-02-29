package emca;

import emca.eventHandler.EventHandler;
import lombok.AllArgsConstructor;
import types.MultiplePredicateActions;

@AllArgsConstructor
public class Emca {
    final private EventHandler eventHandler;
    final private MultiplePredicateActions multiplePredicateActions;
}
