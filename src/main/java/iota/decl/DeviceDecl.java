package decl;

import org.springframework.stereotype.Component;
import types.Capability;
import types.DeviceName;
import types.Name;
import util.JsonUtil;

import java.util.Arrays;
import java.util.List;

@Component
public class DeviceDecl implements Decl {
    private DeviceName deviceName;
    private List<Capability> capabilities;

    public DeviceDecl(String jsonContext) {
        List<String> deviceInfo = JsonUtil.processJsonList(jsonContext);
        this.deviceName = new DeviceName(deviceInfo.get(0));
        this.capabilities = JsonUtil.processJsonList(deviceInfo.get(1)).stream()
                .map(eachInfo -> new Capability(eachInfo))
                .toList();
    }
}
