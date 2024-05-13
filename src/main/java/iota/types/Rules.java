package iota.types;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import iota.decl.exception.DeclNotDeclaredException;
import iota.rule.LeafRule;
import iota.rule.NodeRule;
import iota.rule.Rule;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Rules {
    private Decls decls;
    private List<Rule> rules;

    public Rules(String jsonContext) {
        try {
            this.rules = new ArrayList<>();
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonContext);

            if (rootNode.has("Decls")) {
                JsonNode decls = rootNode.path("Decls");
                this.decls = new Decls(decls.toString());
            } else {
                throw new DeclNotDeclaredException( );
            }

            if (rootNode.has("LeafRule")) {
                JsonNode leafNodes = rootNode.path("LeafRule");
                this.rules.add(LeafRule.fromJson(leafNodes.toString()));
            }
            if (rootNode.has("NodeRule")) {
                JsonNode nodeRule = rootNode.path("NodeRule");
                this.rules.add(NodeRule.fromJson(nodeRule.toString()));
            }
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] Rules : Json Processing 불가");
        }
    }

    public void print() {
        this.rules.stream()
                .forEach(rule -> rule.print());
    }
}
