package com.zhangjiabao.zhangjiabao.all.service.ex;

public class CustomerLoginNameAlreayException extends RuntimeException {

    public CustomerLoginNameAlreayException() {
    }

    public CustomerLoginNameAlreayException(String message) {
        super(message);
    }

    public CustomerLoginNameAlreayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerLoginNameAlreayException(Throwable cause) {
        super(cause);
    }

    public CustomerLoginNameAlreayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
