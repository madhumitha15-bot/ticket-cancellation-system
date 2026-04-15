public class TestRunner {

    public static void main(String[] args) {

        TicketService service = new TicketService();

        int passed = 0;
        int total = 4;

        // Test 1: Full Refund
        if (service.cancelTicket(1000, 30) == 1000) {
            passed++;
            System.out.println("TestFullRefund: PASSED");
        } else {
            System.out.println("TestFullRefund: FAILED");
        }

        // Test 2: Half Refund
        if (service.cancelTicket(1000, 15) == 500) {
            passed++;
            System.out.println("TestHalfRefund: PASSED");
        } else {
            System.out.println("TestHalfRefund: FAILED");
        }

        // Test 3: No Refund
        if (service.cancelTicket(1000, 5) == 0) {
            passed++;
            System.out.println("TestNoRefund: PASSED");
        } else {
            System.out.println("TestNoRefund: FAILED");
        }

        // Test 4: Invalid Input
        if (service.cancelTicket(-1000, -5) == 0) {
            passed++;
            System.out.println("TestInvalidInput: PASSED");
        } else {
            System.out.println("TestInvalidInput: FAILED");
        }

        // Summary
        System.out.println("\nTotal Tests: " + total);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + (total - passed));
    }
}