package emca;

import emca.eventHandler.EventHandler;
import lombok.AllArgsConstructor;
import types.MultiplePredicateActions;

@AllArgsConstructor
public class Emca {
    private EventHandler eventHandler;
    private MultiplePredicateActions multiplePredicateActions;
}
