package exceptionHandling.creatingexception.movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieBooking movie = new MovieBooking();

        System.out.print("Enter customer age: ");
        int age = sc.nextInt();

        try {
            movie.bookTicket(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
