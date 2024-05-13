package iota.types;

public class DeviceName {
    final private String deviceName;

    public void print() {
        System.out.println(deviceName);
    }

    public DeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
