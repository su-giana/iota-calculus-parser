package action;

import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class TickTimer extends Action {
    private final TimerName timerName;
}
