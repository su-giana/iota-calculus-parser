package rule;

import lombok.AllArgsConstructor;
import types.Decls;
import types.Description;

@AllArgsConstructor
public abstract class Rule {
    final private Description description;
    final private Decls decls;
}
