package ex2;

public class TestMain {
    public static void main(String[] args) {
        // Kiểm thử lớp Customer
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);  // Gọi phương thức toString()

        c1.setDiscount(8);
        System.out.println("ID is: " + c1.getId());
        System.out.println("Name is: " + c1.getName());
        System.out.println("Discount is: " + c1.getDiscount());

        // Kiểm thử lớp Invoice
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("ID is: " + inv1.getId());
        System.out.println("Customer's ID is: " + inv1.getCustomerId());
        System.out.println("Customer's name is: " + inv1.getCustomerName());
        System.out.println("Customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("Amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}
