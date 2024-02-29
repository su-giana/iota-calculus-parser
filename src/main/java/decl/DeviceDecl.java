package decl;

import types.Capability;
import types.Name;

import java.util.List;

public class DeviceDecl extends Decl {
    final private List<Capability> capabilities;

    public DeviceDecl(Name declName, List<Capability> capabilities) {
        super(declName);
        this.capabilities = capabilities;
    }
}
