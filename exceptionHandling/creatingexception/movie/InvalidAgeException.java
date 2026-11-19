package exceptionHandling.creatingexception.movie;

public class InvalidAgeException extends Exception {
    InvalidAgeException() {
    }

    InvalidAgeException(String msg) {
        super(msg);
    }
}
