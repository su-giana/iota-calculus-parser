package rule;

import types.Decls;
import types.Description;
import types.Rules;
import java.util.List;
public class NodeRule extends Rule {
    final private List<LeafRule> rules;

    public NodeRule(Description desc, Decls decls, Rules rules) {
        super(desc, decls);
        this.rules = rules;
    }
}
