package exceptionHandling.creatingexception.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        try {
            atm.withdraw(amount);
        } catch (DailyLimitExceededException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
