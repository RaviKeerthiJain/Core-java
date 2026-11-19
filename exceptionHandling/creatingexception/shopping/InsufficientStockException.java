package exceptionHandling.creatingexception.shopping;

public class InsufficientStockException extends Exception {
    InsufficientStockException() {
    }

    InsufficientStockException(String msg) {
        super(msg);
    }
}
