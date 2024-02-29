package rule;

import types.Decls;
import types.Description;

public class LeafRule extends Rule {
    private Emca emca;

    public LeafRule(Description desc, Decls decls, Emca emca) {
        super(desc, decls);
        this.emca = emca;
    }
}
