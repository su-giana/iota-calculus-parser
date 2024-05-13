package iota.rule;

import iota.emca.Emca;
import iota.util.JsonUtil;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LeafRule extends Rule {
    private Emca emca;

    public static LeafRule fromJson(String jsonContext) {
        List<String> components = JsonUtil.processJsonList(jsonContext);
        if (components.size() < 3) {
            throw new IllegalArgumentException("Invalid JSON format");
        }
        return new LeafRule(components.get(0), components.get(1), components.get(2));
    }

    private LeafRule(String des, String decls, String ecma) {
        super(des, decls);
        this.emca = Emca.fromJson(ecma);
    }

    public void print() {
        super.print();
        emca.print();
    }
}
