package baitap;

import java.time.LocalDate;
import java.util.List;

public class Order {
    // Thuộc tính
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Customer customer;
    private List<Product> products;

    // Constructor
    public Order(LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, List<Product> products) {
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.products = products;
    }

    // Getters
    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Ghi đè toString() để in thông tin đơn hàng
    @Override
    public String toString() {
        return "Order{orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status='" + status + "'}";
    }
}
