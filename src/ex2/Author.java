package ex2;

public class Author {
    private String name;
    private String email;

    // Constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho email
    public String getEmail() {
        return email;
    }

    // Setter cho email
    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức toString() để hiển thị thông tin của Author
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}


