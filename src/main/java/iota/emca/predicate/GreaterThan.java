package emca.predicate;

import expression.Expression;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class GreaterThan implements Predicate {
     private Predicate predicate;
     private Expression expression;
}
