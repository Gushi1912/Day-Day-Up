package com.gushi.multipartserver.exception;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/2/23
 */
public class MultipartServerException extends RuntimeException{
    public MultipartServerException() {
        super();
    }

    public MultipartServerException(String message) {
        super(message);
    }

    public MultipartServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultipartServerException(Throwable cause) {
        super(cause);
    }

    protected MultipartServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
