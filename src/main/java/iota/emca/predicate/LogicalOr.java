package emca.predicate;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class LogicalOr implements Predicate {
    private Predicate predicateLeft;
    private Predicate predicateRight;
}
