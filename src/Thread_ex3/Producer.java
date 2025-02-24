package Thread_ex3;

public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.addBread();
            try {
                Thread.sleep(1500); // Sản xuất mất 1.5 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

