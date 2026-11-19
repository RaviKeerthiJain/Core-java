class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void displayBankDetails() {
        System.out.println("Bank Name      : " + bankName);
    }
}

class Account extends Bank {
    long accountNumber;
    double balance;

    Account(String bankName, long accountNumber, double balance) {
        super(bankName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        displayBankDetails();
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate; // percent per year

    SavingsAccount(String bankName, long accountNumber, double balance, double interestRate) {
        super(bankName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("State Bank", 1234567890L, 50000, 4.5);
        sa.displayAccount();
        System.out.println("Interest Rate  : " + sa.interestRate + "%");
        System.out.println("Yearly Interest: " + sa.calculateInterest());
    }
}
