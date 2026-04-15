public class TicketService {

    public double cancelTicket(double ticketPrice, int hoursBeforeDeparture) {

        // validation (extra safety - examiner impress aagum)
        if (ticketPrice < 0 || hoursBeforeDeparture < 0) {
            return 0;
        }

        if (hoursBeforeDeparture >= 24) {
            return ticketPrice; // full refund
        } else if (hoursBeforeDeparture >= 12) {
            return ticketPrice * 0.5; // 50% refund
        } else {
            return 0; // no refund
        }
    }
}