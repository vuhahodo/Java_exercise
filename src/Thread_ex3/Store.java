package Thread_ex3;

public class Store {
    private int breadCount; // Số bánh mì hiện có
    private final int capacity; // Số bánh mì tối đa

    public Store(int capacity) {
        this.capacity = capacity;
        this.breadCount = capacity; // Bắt đầu với cửa hàng đầy bánh mì
    }

    // Nhà sản xuất cung cấp bánh mì
    public synchronized void addBread() {
        while (breadCount >= capacity) {
            try {
                System.out.println("⚠️ Cửa hàng đầy, nhà sản xuất chờ...");
                wait(); // Chờ đến khi có chỗ trống
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++; // Thêm bánh mì
        System.out.println("✅ Nhà sản xuất cung cấp bánh mì. Tổng: " + breadCount);
        notifyAll(); // Báo cho người mua biết có bánh mì
    }

    // Người mua mua bánh mì
    public synchronized void buyBread(String buyerName) {
        while (breadCount == 0) {
            try {
                System.out.println("❌ " + buyerName + " chờ vì cửa hàng hết bánh...");
                wait(); // Chờ đến khi có bánh mì
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--; // Giảm bánh mì
        System.out.println("🛒 " + buyerName + " mua 1 bánh mì. Còn lại: " + breadCount);
        notifyAll(); // Báo cho nhà sản xuất có thể làm thêm
    }
}
