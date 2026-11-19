package exceptionHandling.creatingexception.movie;

public class MovieBooking {
    void bookTicket(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age. Only 18+ allowed for this movie");
        }
        System.out.println("Ticket booked successfully");
    }
}
