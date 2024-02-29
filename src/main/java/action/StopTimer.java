package action;

import lombok.AllArgsConstructor;
import types.TimerName;

@AllArgsConstructor
public class StopTimer extends Action {
    private final TimerName timerName;
}
