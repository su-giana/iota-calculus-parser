package rule;

import lombok.AllArgsConstructor;
import types.Decls;
import types.Description;

@AllArgsConstructor
public abstract class Rule {
    private Description description;
    private Decls decls;
}
