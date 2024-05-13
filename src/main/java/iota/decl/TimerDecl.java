package iota.decl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.Name;

@Component
@RequiredArgsConstructor
public class TimerDecl implements Decl {
    private String timerName;
    public TimerDecl(String jsonContext) {
        this.timerName = jsonContext;
    }

    @Override
    public void print() {
        System.out.println("timerName : " + timerName);
    }
}
