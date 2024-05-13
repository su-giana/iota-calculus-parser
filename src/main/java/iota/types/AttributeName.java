package types;

import lombok.AllArgsConstructor;

public class AttributeName {
    final private Name attributeName;

    public AttributeName(String attributeName) {
        this.attributeName = new Name(attributeName);
    }
}
