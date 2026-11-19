class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void makePayment() {
        System.out.println("Payment of " + amount + " made.");
    }
}

class UPI extends Payment {
    UPI(double amount) { super(amount); }

    @Override
    void makePayment() {
        System.out.println("UPI payment of Rs." + amount + " successful.");
    }
}

class CreditCard extends Payment {
    CreditCard(double amount) { super(amount); }

    @Override
    void makePayment() {
        System.out.println("Credit Card payment of Rs." + amount + " approved.");
    }
}

class DebitCard extends Payment {
    DebitCard(double amount) { super(amount); }

    @Override
    void makePayment() {
        System.out.println("Debit Card payment of Rs." + amount + " completed.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment[] payments = { new UPI(500), new CreditCard(1500), new DebitCard(750) };
        for (Payment p : payments) {
            p.makePayment();
        }
    }
}
