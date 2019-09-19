package com.zhangjiabao.zhangjiabao.all.service.ex;

public class UserNameDoesNotExistException extends RuntimeException {

    public UserNameDoesNotExistException() {
    }

    public UserNameDoesNotExistException(String message) {
        super(message);
    }

    public UserNameDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameDoesNotExistException(Throwable cause) {
        super(cause);
    }

    public UserNameDoesNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
