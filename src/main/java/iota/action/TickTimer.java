package action;

import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class TickTimer implements Action {
    private final TimerName timerName;
}
