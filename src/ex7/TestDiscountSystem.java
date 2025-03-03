package ex7;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        // Tạo khách hàng
        Customer c1 = new Customer("Alice");
        c1.setMemberType("Gold");

        Customer c2 = new Customer("Bob");
        c2.setMemberType("Premium");

        Customer c3 = new Customer("Charlie"); // Không có thành viên

        // Tạo các lượt ghé thăm
        Visit v1 = new Visit("Alice", new Date());
        v1.setServiceExpense(100);
        v1.setProductExpense(50);

        Visit v2 = new Visit("Bob", new Date());
        v2.setServiceExpense(200);
        v2.setProductExpense(100);

        Visit v3 = new Visit("Charlie", new Date());
        v3.setServiceExpense(150);
        v3.setProductExpense(70);

        // In thông tin khách hàng và tổng chi phí
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}

