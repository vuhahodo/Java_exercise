package baiToan5TrietGiaAnToi;

public class DiningTable {
    private static final int NUM_PHILOSOPHERS = 5;

    public void startDinner() {
        Fork[] forks = new Fork[NUM_PHILOSOPHERS];
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        // Khởi tạo nĩa
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Fork();
        }

        // Khởi tạo triết gia và gán nĩa trái/phải
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];

            // Để tránh deadlock, triết gia cuối cùng đổi vị trí lấy nĩa
            if (i == NUM_PHILOSOPHERS - 1) {
                philosophers[i] = new Philosopher(i, rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(i, leftFork, rightFork);
            }
        }

        // Bắt đầu chạy các luồng
        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}

