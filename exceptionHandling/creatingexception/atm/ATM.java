package exceptionHandling.creatingexception.atm;

public class ATM {
    static final int DAILY_LIMIT = 25000;

    void withdraw(int amount) throws DailyLimitExceededException {
        if (amount > DAILY_LIMIT) {
            throw new DailyLimitExceededException("Daily limit exceeded. You can withdraw up to Rs." + DAILY_LIMIT + " per day");
        }
        System.out.println("Rs." + amount + " withdrawn successfully");
    }
}
