package dev.simplix.protocolize.api.util.exception;

import dev.simplix.protocolize.api.item.component.DataComponentType;

public class InvalidDataComponentVersionException extends ProtocolizeException {
    public InvalidDataComponentVersionException(DataComponentType<?> componentType, int protocolVersion) {
        super("Component " + componentType.getName() + " can not be used on protocol version " + protocolVersion);
    }
}
