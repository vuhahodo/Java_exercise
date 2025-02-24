package ex2;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    // Constructor
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter cho customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter cho amount
    public double getAmount() {
        return amount;
    }

    // Setter cho amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Lấy ID của khách hàng
    public int getCustomerId() {
        return customer.getId();
    }

    // Lấy tên khách hàng
    public String getCustomerName() {
        return customer.getName();
    }

    // Lấy giảm giá của khách hàng
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Tính số tiền sau khi giảm giá
    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    // Phương thức toString() để hiển thị thông tin của Invoice
    @Override
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}

