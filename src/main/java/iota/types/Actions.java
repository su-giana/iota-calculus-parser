package types;

import action.Action;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import util.JsonUtil;

import java.util.ArrayList;
import java.util.List;

@Component
public class Actions {
    private List<Action> actions;

    public Actions(String jsonContext) {
        this.actions = new ArrayList<>();

        List<String> actionsJson = JsonUtil.processJsonList(jsonContext);
        actionsJson.stream()
                .map(actionJson -> Action.fromJson(actionJson))
                .forEach(this.actions::add);
    }
}
