package Thread_ex2;

public class TicketAgency extends Thread {
    private TicketCounter ticketCounter;
    private String agencyName;

    public TicketAgency(TicketCounter ticketCounter, String agencyName) {
        this.ticketCounter = ticketCounter;
        this.agencyName = agencyName;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ticketCounter) {
                if (!ticketCounter.sellTicket(agencyName)) {
                    break; // Hết vé thì dừng lại
                }
            }

            try {
                Thread.sleep(100); // Mô phỏng thời gian bán vé
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
