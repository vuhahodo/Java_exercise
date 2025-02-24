package ex2;

public class Customer {
    private int id;
    private String name;
    private int discount; // Giảm giá theo phần trăm

    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho discount
    public int getDiscount() {
        return discount;
    }

    // Setter cho discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // Phương thức toString() để hiển thị thông tin của Customer
    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}

