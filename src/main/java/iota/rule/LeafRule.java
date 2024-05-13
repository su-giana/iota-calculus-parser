package rule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import emca.Emca;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import types.Decls;
import types.Description;
import util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

@Component
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
}
