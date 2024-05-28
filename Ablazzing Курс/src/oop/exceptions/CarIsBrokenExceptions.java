package oop.exceptions;

public class CarIsBrokenExceptions extends Exception {
    public CarIsBrokenExceptions() {
    }

    public CarIsBrokenExceptions(String message) {
        super(message);
    }

    public CarIsBrokenExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public CarIsBrokenExceptions(Throwable cause) {
        super(cause);
    }

    public CarIsBrokenExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
