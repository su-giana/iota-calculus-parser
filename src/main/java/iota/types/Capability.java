package types;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import util.JsonUtil;

import java.util.List;

public class Capability {
    private String capabilityName;
    private String capabilityState;

    public Capability(String jsonContext) {
        List<String> nameAndState = JsonUtil.processJsonList(jsonContext);
        this.capabilityName = nameAndState.get(0);
        this.capabilityState = nameAndState.get(1);
    }
}
