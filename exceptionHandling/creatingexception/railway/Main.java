package exceptionHandling.creatingexception.railway;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available seats: ");
        TrainBooking train = new TrainBooking(sc.nextInt());

        System.out.print("Enter requested seats: ");
        int seats = sc.nextInt();

        try {
            train.bookTicket(seats);
        } catch (SeatNotAvailableException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
