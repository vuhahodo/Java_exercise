package Thread_ex3;

import java.util.Random;

public class Consumer extends Thread {
    private Store store;
    private String buyerName;
    private Random random = new Random();

    public Consumer(Store store, String buyerName) {
        this.store = store;
        this.buyerName = buyerName;
    }

    @Override
    public void run() {
        while (true) {
            store.buyBread(buyerName);
            try {
                Thread.sleep(random.nextInt(1500) + 500); // Mua nhanh hơn (0.5s - 2s)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



