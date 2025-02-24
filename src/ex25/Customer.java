package ex25;

public class Customer {
    private int id;
    private String name;
    private char gender; // 'm' hoặc 'f'

    // Constructor
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // Getter cho id
    public int getId() {
        return id;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho gender
    public char getGender() {
        return gender;
    }

    // Phương thức toString() để hiển thị thông tin của Customer
    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
}
