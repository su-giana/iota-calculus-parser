package types;

import literal.Literal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class EventConstant {
    private Literal eventConstant;

    public EventConstant(String jsonContext) {
        this.eventConstant = Literal.fromJson(jsonContext);
    }
}
