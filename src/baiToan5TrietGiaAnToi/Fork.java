package baiToan5TrietGiaAnToi;

public class Fork {
    private boolean isTaken = false;

    public synchronized void pickUp() throws InterruptedException {
        while (isTaken) {
            wait();
        }
        isTaken = true;
    }

    public synchronized void putDown() {
        isTaken = false;
        notifyAll();
    }
}
