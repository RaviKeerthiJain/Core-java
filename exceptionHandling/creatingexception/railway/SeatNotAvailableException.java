package exceptionHandling.creatingexception.railway;

public class SeatNotAvailableException extends Exception {
    SeatNotAvailableException() {
    }

    SeatNotAvailableException(String msg) {
        super(msg);
    }
}
