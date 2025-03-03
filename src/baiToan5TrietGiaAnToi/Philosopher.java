package baiToan5TrietGiaAnToi;

public class Philosopher extends Thread {
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang suy nghĩ...");
        Thread.sleep((long) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Triết gia " + id + " đang ăn...");
        Thread.sleep((long) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                synchronized (leftFork) {
                    leftFork.pickUp();
                    System.out.println("Triết gia " + id + " nhấc nĩa trái.");
                    synchronized (rightFork) {
                        rightFork.pickUp();
                        System.out.println("Triết gia " + id + " nhấc nĩa phải.");
                        eat();
                        rightFork.putDown();
                    }
                    leftFork.putDown();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

