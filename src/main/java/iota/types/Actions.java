package iota.types;

import iota.action.Action;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Actions {
    private List<Action> actions;

    public Actions(String jsonContext) {
        this.actions = new ArrayList<>();

        List<String> actionsJson = JsonUtil.processJsonList(jsonContext);
        actionsJson.stream()
                .map(actionJson -> Action.fromJson(actionJson))
                .forEach(this.actions::add);
    }

    public void print() {
        actions.stream()
                .forEach(ac -> ac.print());
    }
}
