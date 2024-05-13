package iota.types;

import iota.util.JsonUtil;

import java.util.List;

public class Capability {
    private String capabilityName;
    private String capabilityState;

    public Capability(String jsonContext) {
        List<String> nameAndState = JsonUtil.processJsonList(jsonContext);
        this.capabilityName = nameAndState.get(0);
        this.capabilityState = nameAndState.get(1);
    }

    public void print() {
        System.out.println(capabilityName + " " + capabilityState);
    }
}
