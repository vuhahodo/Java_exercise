package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
    public void addCustomer(String name, String phone, String email) {
        String query = "INSERT INTO customers (name, phone, email) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getCustomerOrders(int customerId) {
        List<String> orders = new ArrayList<>();
        String query = "SELECT id, total_amount FROM orders WHERE customer_id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, customerId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                orders.add("Order ID: " + rs.getInt("id") + ", Total: " + rs.getDouble("total_amount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }
}
