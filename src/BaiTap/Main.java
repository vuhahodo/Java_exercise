package baitap;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Tạo dữ liệu mẫu
        Customer customer1 = new Customer(2);
        Customer customer2 = new Customer(1);

        Product p1 = new Product("Doll", "Toys", 100.0);
        Product p2 = new Product("Car", "Toys", 50.0);
        Product p3 = new Product("Book", "Stationery", 30.0);
        Product p4 = new Product("Doll", "Toys", 100.0);

        List<Product> products1 = Arrays.asList(p1, p2);
        List<Product> products2 = Arrays.asList(p3, p4);

        Order order1 = new Order(LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 20), "Delivered", customer1, products1);
        Order order2 = new Order(LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), "Delivered", customer1, products2);
        Order order3 = new Order(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 5), "Pending", customer2, products1);

        List<Order> orders = Arrays.asList(order1, order2, order3);

        // Xử lý yêu cầu
        LocalDate startDate = LocalDate.of(2021, 2, 1);
        LocalDate endDate = LocalDate.of(2021, 4, 1);

        List<Product> discountedProducts = orders.stream()
            .filter(order -> order.getCustomer().getTier() == 2)
            .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
            .peek(System.out::println)
            .flatMap(order -> order.getProducts().stream())
            .peek(product -> {
                if (product.getCategory().equals("Toys")) {
                    product.setPrice(product.getPrice() * 0.9);
                }
            })
            .distinct()
            .collect(Collectors.toList());

        System.out.println("\nDanh sách sản phẩm sau khi giảm giá:");
        discountedProducts.forEach(System.out::println);
    }
}
