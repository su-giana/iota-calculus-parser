package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreaterThanOrEqualTo extends Predicate {
    private final Predicate predicate;
    private final Expression expression;
}
