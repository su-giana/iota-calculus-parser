package types;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import rule.LeafRule;
import rule.Rule;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Rules {
    private List<Rule> rules;

    public Rules(String jsonContext) {
        try {
            this.rules = new ArrayList<>();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonContext);

            if (rootNode.has("LeafRule")) {
                JsonNode leafNodes = rootNode.path("LeafRule");
                for (JsonNode objNode : leafNodes) {
                    this.rules.add(LeafRule.fromJson(objNode.toString()));
                }
            }
            if (rootNode.has("NodeRule")) {
                JsonNode leafNodes = rootNode.path("NodeRule");
                for (JsonNode objNode : leafNodes) {
                    this.rules.add(LeafRule.fromJson(objNode.toString()));
                }
            }
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] Rules : Json Processing 불가");
        }
    }
}
