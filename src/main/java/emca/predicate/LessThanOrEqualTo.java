package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LessThanOrEqualTo extends Predicate {
    private final Predicate predicate;
    private final Expression expression;
}
