package src.main.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TicketServiceTest {

    TicketService service = new TicketService();

    @Test
    public void testFullRefund() {
        double result = service.cancelTicket(1000, 30);
        assertEquals(1000, result);
    }

    @Test
    public void testHalfRefund() {
        double result = service.cancelTicket(1000, 15);
        assertEquals(500, result);
    }

    @Test
    public void testNoRefund() {
        double result = service.cancelTicket(1000, 5);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidInput() {
        double result = service.cancelTicket(-1000, -5);
        assertEquals(0, result);
    }
}