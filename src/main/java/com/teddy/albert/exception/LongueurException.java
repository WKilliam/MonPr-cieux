package com.teddy.albert.exception;

public class LongueurException extends Throwable {
    public LongueurException() {
    }

    public LongueurException(String message) {
        super(message);
    }

    public LongueurException(String message, Throwable cause) {
        super(message, cause);
    }

    public LongueurException(Throwable cause) {
        super(cause);
    }

    public LongueurException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
