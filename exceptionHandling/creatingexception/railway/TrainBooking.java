package exceptionHandling.creatingexception.railway;

public class TrainBooking {
    int availableSeats;

    TrainBooking(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    void bookTicket(int requestedSeats) throws SeatNotAvailableException {
        if (requestedSeats > availableSeats) {
            throw new SeatNotAvailableException("Seats not available. Only " + availableSeats + " seat(s) left");
        }
        availableSeats -= requestedSeats;
        System.out.println("Booking confirmed for " + requestedSeats + " seat(s)");
    }
}
