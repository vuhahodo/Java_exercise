package ex2;

public class Book {
    private String isbn;
    private String name;
    private Author author; // Một sách chỉ có một tác giả
    private double price;
    private int qty = 0; // Mặc định là 0 nếu không được cung cấp

    // Constructor 1: Khởi tạo isbn, name, author và price (mặc định qty = 0)
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor 2: Khởi tạo isbn, name, author, price và qty
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter cho isbn
    public String getIsbn() {
        return isbn;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho author
    public Author getAuthor() {
        return author;
    }

    // Getter cho price
    public double getPrice() {
        return price;
    }

    // Setter cho price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter cho qty
    public int getQty() {
        return qty;
    }

    // Setter cho qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Trả về tên tác giả
    public String getAuthorName() {
        return author.getName();
    }

    // Trả về email của tác giả
    public String getAuthorEmail() {
        return author.getEmail();
    }

    // Phương thức toString() để hiển thị thông tin của Book
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + ",Author=" + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}


