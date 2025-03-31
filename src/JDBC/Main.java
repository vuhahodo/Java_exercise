package JDBC;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDAO customerDAO = new CustomerDAO();
        OrderDAO orderDAO = new OrderDAO();
        ProductDAO productDAO = new ProductDAO();

        while (true) {
            System.out.println("\n=== QUẢN LÝ ĐƠN HÀNG ===");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Xem lịch sử đơn hàng");
            System.out.println("3. Thêm đơn hàng mới");
            System.out.println("4. Thêm sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Tên khách hàng: ");
                    String name = scanner.nextLine();
                    System.out.print("SĐT: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    customerDAO.addCustomer(name, phone, email);
                    System.out.println("Khách hàng đã được thêm!");
                    break;

                case 2:
                    System.out.print("Nhập ID khách hàng: ");
                    int customerId = scanner.nextInt();
                    List<String> orders = customerDAO.getCustomerOrders(customerId);
                    if (orders.isEmpty()) System.out.println("Không có đơn hàng!");
                    else orders.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Nhập ID khách hàng: ");
                    int custId = scanner.nextInt();
                    int orderId = orderDAO.addOrder(custId);
                    if (orderId != -1) {
                        System.out.println("Đơn hàng đã tạo! ID: " + orderId);
                    } else {
                        System.out.println("Lỗi khi thêm đơn hàng!");
                    }
                    break;

                case 4:
                    System.out.print("Tên sản phẩm: ");
                    String productName = scanner.nextLine();
                    System.out.print("Giá: ");
                    double price = scanner.nextDouble();
                    System.out.print("Tồn kho: ");
                    int stock = scanner.nextInt();
                    productDAO.addProduct(productName, price, stock);
                    System.out.println("Sản phẩm đã thêm!");
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
