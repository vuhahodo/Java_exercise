package baitap;

import java.util.Objects;

public class Product {
    // Thuộc tính
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // Setter cho price (cần để áp dụng giảm giá)
    public void setPrice(double price) {
        this.price = price;
    }

    // Ghi đè equals() để so sánh sản phẩm trùng lặp dựa trên name và category
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && category.equals(product.category);
    }

    // Ghi đè hashCode() để tương thích với equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    // Ghi đè toString() để in thông tin sản phẩm
    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}
