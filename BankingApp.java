class Bank {
    void deposit(int amount) {
        System.out.println("Deposited (integer): " + amount);
    }

    void deposit(double amount) {
        System.out.println("Deposited (decimal): " + amount);
    }

    void deposit(double amount, String description) {
        System.out.println("Deposited: " + amount + " | Description: " + description);
    }
}


public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(5000);
        bank.deposit(2500.75);
        bank.deposit(1000.0, "Salary credit");
    
}
}
