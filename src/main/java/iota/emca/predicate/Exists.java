package emca.predicate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import types.BoundVariable;
import types.Group;

@Component
public class Exists implements Predicate{
    private Group group;
    private  BoundVariable boundVariable;
    private  Predicate predicate;
}
