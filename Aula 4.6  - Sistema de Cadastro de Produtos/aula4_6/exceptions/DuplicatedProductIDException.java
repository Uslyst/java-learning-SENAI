package aula4_6.exceptions;

public class DuplicatedProductIDException extends RuntimeException{
    public DuplicatedProductIDException(String message) {
        super(message);
    }   
}
