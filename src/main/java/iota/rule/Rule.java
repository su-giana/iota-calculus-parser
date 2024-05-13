package iota.rule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import iota.decl.Decl;
import iota.types.Decls;
import iota.types.Description;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public abstract class Rule {
    private Description description;
    private Decls decls;
    final private ObjectMapper objectMapper = new ObjectMapper();

    public Rule(String description, String decls) {
        this.description = new Description(description);
        this.decls = new Decls(decls);
    }

    public void print() {
        this.description.print();
        this.decls.print();
    }
}
