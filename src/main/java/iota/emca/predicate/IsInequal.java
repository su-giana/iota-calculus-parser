package emca.predicate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class IsInequal implements Predicate {
    private  Predicate predicateLeft;
    private  Predicate predicateRight;
}
