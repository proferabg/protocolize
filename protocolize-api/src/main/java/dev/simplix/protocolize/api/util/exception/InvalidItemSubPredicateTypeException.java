package dev.simplix.protocolize.api.util.exception;

public class InvalidItemSubPredicateTypeException extends ProtocolizeException {
    public InvalidItemSubPredicateTypeException(String predicateType, int protocolVersion) {
        super("Could not find item sub predicate type " + predicateType + " for protocol version " + protocolVersion + ". This item is not compatible with Protocolize.");
    }
}
