package com.gushi.multiserver.exception;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/25
 */
public class MultiServerException extends RuntimeException{
    public MultiServerException() {
        super();
    }

    public MultiServerException(String message) {
        super(message);
    }

    public MultiServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultiServerException(Throwable cause) {
        super(cause);
    }

    protected MultiServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
