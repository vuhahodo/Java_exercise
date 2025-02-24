package ex25;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    // Constructor với balance mặc định là 0.0
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // Constructor với balance tùy chỉnh
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho customer
    public Customer getCustomer() {
        return customer;
    }

    // Getter cho balance
    public double getBalance() {
        return balance;
    }

    // Setter cho balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Lấy tên khách hàng
    public String getCustomerName() {
        return customer.getName();
    }

    // Nạp tiền vào tài khoản
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    // Rút tiền từ tài khoản (nếu đủ số dư)
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    // Phương thức toString() hiển thị thông tin tài khoản
    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}

