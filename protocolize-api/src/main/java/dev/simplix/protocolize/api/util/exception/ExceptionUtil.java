package dev.simplix.protocolize.api.util.exception;

public class ExceptionUtil {

    public static Throwable getRootCause(Throwable e) {
        Throwable cause = null;
        Throwable result = e;

        while(null != (cause = result.getCause())  && (result != cause) ) {
            result = cause;
        }
        return result;
    }

}
