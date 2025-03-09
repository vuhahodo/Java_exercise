package Thread_ex2;

public class Main {
    public static void main(String[] args) {
    	// Khởi tạo quầy vé với 20 ghế
        TicketCounter ticketCounter = new TicketCounter(20); 
        // Tạo 3 đại lý bán vé, tất cả đều dùng chung một quầy vé (ticketCounter)
        TicketAgency agency1 = new TicketAgency(ticketCounter, "Đại lý A");
        TicketAgency agency2 = new TicketAgency(ticketCounter, "Đại lý B");
        TicketAgency agency3 = new TicketAgency(ticketCounter, "Đại lý C");

        agency1.start();
        agency2.start();
        agency3.start();
    }
}

