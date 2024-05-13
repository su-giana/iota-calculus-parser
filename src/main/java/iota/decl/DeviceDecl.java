package iota.decl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import iota.types.Capability;
import iota.types.DeviceName;
import iota.util.JsonUtil;

import java.util.List;

@Component
@RequiredArgsConstructor
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

    @Override
    public void print() {
        deviceName.print();
        capabilities.stream()
                .forEach(capa -> capa.print());
    }
}
