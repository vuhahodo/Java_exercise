package Thread_ex3;

public class Main {
    public static void main(String[] args) {
        int storeCapacity = 10; // Cửa hàng chứa tối đa 10 bánh mì
        Store store = new Store(storeCapacity);

        Producer producer = new Producer(store);
        Consumer consumer1 = new Consumer(store, "Người mua A");
        Consumer consumer2 = new Consumer(store, "Người mua B");
        

        producer.start(); // Nhà sản xuất bắt đầu làm bánh
        consumer1.start(); // Người mua A bắt đầu mua
        consumer2.start(); // Người mua B bắt đầu mua
        
    }
}
