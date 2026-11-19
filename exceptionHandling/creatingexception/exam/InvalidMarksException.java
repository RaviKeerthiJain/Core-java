package exceptionHandling.creatingexception.exam;

public class InvalidMarksException extends Exception {
    InvalidMarksException() {
    }

    InvalidMarksException(String msg) {
        super(msg);
    }
}
