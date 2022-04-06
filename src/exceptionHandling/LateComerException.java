package exceptionHandling;

public class LateComerException extends Exception{
    public LateComerException() {
    }

    public LateComerException(String message) {
        super(message);
    }
}
