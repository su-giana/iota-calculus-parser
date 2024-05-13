package iota;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import iota.types.Rules;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
@Slf4j
public class RootRule {
    private final ObjectMapper objectMapper;
    private final Rules rules;

    public RootRule( ) throws IOException {
        InputStream inputStream = Rules.class.getResourceAsStream("/iota.json");
        this.objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(inputStream);
        this.rules = new Rules(jsonNode.toString());
        this.rules.print();
    }
}
