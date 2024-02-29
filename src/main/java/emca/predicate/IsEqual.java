package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IsEqual extends Predicate {
    private final Predicate predicateLeft;
    private final Predicate predicateRight;
}
