package com.github.rollsbean.xmind.exception;

/**
 * @author 景行
 * @author Kevin Fan
 * @date 2021/07/06
 **/
public class XmindCommonException extends RuntimeException{

    public XmindCommonException() {
        super();
    }

    public XmindCommonException(String message) {
        super(message);
    }

    public XmindCommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public XmindCommonException(Throwable cause) {
        super(cause);
    }

    protected XmindCommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
