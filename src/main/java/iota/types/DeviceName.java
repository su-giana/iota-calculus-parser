package types;

import lombok.AllArgsConstructor;

public class DeviceName {
    final private Name deviceName;

    public DeviceName(String deviceName) {
        this.deviceName = new Name(deviceName);
    }
}
