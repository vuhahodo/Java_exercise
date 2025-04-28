package baitap;

public class Customer {
    // Thuộc tính
    private int tier;

    // Constructor
    public Customer(int tier) {
        this.tier = tier;
    }

    // Getter
    public int getTier() {
        return tier;
    }

    // Setter (tùy chọn, nếu cần thay đổi tier sau này)
    public void setTier(int tier) {
        this.tier = tier;
    }
}
