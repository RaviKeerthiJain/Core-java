package exceptionHandling.creatingexception.atm;

public class DailyLimitExceededException extends Exception {
    DailyLimitExceededException() {
    }

    DailyLimitExceededException(String msg) {
        super(msg);
    }
}
