package com.zhangjiabao.zhangjiabao.all.service.ex;

public class PassWordErrorException extends RuntimeException {

    public PassWordErrorException() {
    }

    public PassWordErrorException(String message) {
        super(message);
    }

    public PassWordErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PassWordErrorException(Throwable cause) {
        super(cause);
    }

    public PassWordErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
