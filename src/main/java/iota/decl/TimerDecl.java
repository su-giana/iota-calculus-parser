package decl;

import org.springframework.stereotype.Component;
import types.Name;

@Component
public class TimerDecl implements Decl {
    private Name timerName;
    public TimerDecl(String jsonContext) {
        this.timerName = new Name(jsonContext);
    }
}
