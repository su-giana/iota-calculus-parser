package action;

import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class StopTimer implements Action {
    private final TimerName timerName;
}
