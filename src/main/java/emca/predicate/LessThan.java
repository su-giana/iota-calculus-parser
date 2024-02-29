package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LessThan extends Predicate {
    private final Predicate predicate;
    private final Expression expression;
}
