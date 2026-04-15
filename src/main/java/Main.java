public class Main {
    public static void main(String[] args) {

        TicketService service = new TicketService();

        double r1 = service.cancelTicket(1000, 30);
        double r2 = service.cancelTicket(1000, 15);
        double r3 = service.cancelTicket(1000, 5);

        System.out.println("Refund (30 hrs): " + r1);
        System.out.println("Refund (15 hrs): " + r2);
        System.out.println("Refund (5 hrs): " + r3);
    }
}