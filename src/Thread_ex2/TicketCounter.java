package Thread_ex2;

public class TicketCounter {
    private int availableSeats;
    private int totalSeats; // Lưu số ghế ban đầu để tính thứ tự

    public TicketCounter(int totalSeats) {
        this.availableSeats = totalSeats;
        this.totalSeats = totalSeats; // Gán giá trị ban đầu
    }

    public synchronized boolean sellTicket(String agencyName) {
        if (availableSeats > 0) {
            int soldSeatNumber = (totalSeats - availableSeats) + 1; // Tính đúng số ghế
            System.out.println(agencyName + " bán vé ghế số: " + soldSeatNumber);
            availableSeats--; // Giảm số ghế còn lại
            return true;
        } else {
            return false; // Hết vé
        }
    }
}

