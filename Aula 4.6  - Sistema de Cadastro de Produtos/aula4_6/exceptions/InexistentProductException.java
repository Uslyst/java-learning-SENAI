package aula4_6.exceptions;

public class InexistentProductException extends RuntimeException {
    public InexistentProductException(String message) {
        super(message);
    }
}
