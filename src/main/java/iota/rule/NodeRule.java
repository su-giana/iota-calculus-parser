package rule;

import org.springframework.stereotype.Component;
import types.Decls;
import types.Description;
import types.Rules;
import util.JsonUtil;

import java.util.List;

@Component
public class NodeRule extends Rule {
    final private Rules rules;

    public static NodeRule fromJson(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        if (components.size() < 3) {
            throw new IllegalArgumentException("Invalid JSON format");
        }
        return new NodeRule(components.get(0), components.get(1), components.get(2));
    }

    public NodeRule(String des,String decls, String rules) {
        super(des, decls);
        this.rules = new Rules(rules);
    }
}
