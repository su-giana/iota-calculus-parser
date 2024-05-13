package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class LessThanOrEqualTo implements Predicate {
    private Predicate predicate;
    private Expression expression;
}
