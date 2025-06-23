package dev.simplix.protocolize.api.util.exception;

public class InvalidDataComponentTypeException extends ProtocolizeException {
    public InvalidDataComponentTypeException(int componentId, int protocolVersion) {
        super("Could not find component type " + componentId + " for protocol version " +
            protocolVersion + ". This item is not compatible with Protocolize.");
    }
}
