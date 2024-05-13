package rule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import decl.Decl;
import lombok.AllArgsConstructor;
import types.Decls;
import types.Description;

import java.util.List;

public abstract class Rule {
    private Description description;
    private Decls decls;
    final private ObjectMapper objectMapper = new ObjectMapper();

    public Rule(String description, String decls) {
        try {
            this.description = new Description(description);
            List<Decl> declsContent= objectMapper.readValue(decls, new TypeReference<List<Decl>>() {});
            this.decls = new Decls(declsContent);
        } catch (JsonMappingException e) {
            System.out.println("[ERROR] Rule : Json Mapping에 실패하였습니다");
        } catch (JsonProcessingException e) {
            System.out.println("[ERROR] Rule : Json Processing에 실패하였습니다");
        }
    }
}
