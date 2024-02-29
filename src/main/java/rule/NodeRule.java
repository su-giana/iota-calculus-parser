package rule;

import types.Decls;
import types.Description;
import types.Rules;

public class NodeRule extends Rule {
    private Rules rules;

    public NodeRule(Description desc, Decls decls, Rules rules) {
        super(desc, decls);
        this.rules = rules;
    }
}
