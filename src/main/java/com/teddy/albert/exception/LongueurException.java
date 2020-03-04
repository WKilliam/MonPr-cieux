package E.L.I.L.Y.A.Exception;

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
