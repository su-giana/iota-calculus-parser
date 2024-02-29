package emca.predicate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IsInequal extends Predicate {
    private final Predicate predicateLeft;
    private final Predicate predicateRight;
}
