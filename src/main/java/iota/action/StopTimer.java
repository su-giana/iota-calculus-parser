package iota.action;

import lombok.AllArgsConstructor;
import iota.types.TimerName;

@AllArgsConstructor
public class StopTimer implements Action {
    private final TimerName timerName;

    @Override
    public void print() {

    }
}
