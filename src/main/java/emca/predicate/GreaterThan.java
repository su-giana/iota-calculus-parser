package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreaterThan extends Predicate {
    final private Predicate predicate;
    final private Expression expression;
}
