package iota.types;

import iota.literal.Literal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EventConstant {
    private Literal eventConstant;

    public void print() {
        System.out.print("EventConstant : ");
        eventConstant.print();
    }

    public EventConstant(String jsonContext) {
        this.eventConstant = Literal.fromJson(jsonContext);
    }
}
