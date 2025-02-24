package Thread_ex1;

public class SharedPrinter {
    private boolean isOddTurn = false; // Bắt đầu với số chẵn (0)

    public synchronized void printOdd(int number) {
        while (!isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd: " + number);
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven(int number) {
        while (isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even: " + number);
        isOddTurn = true;
        notify();
    }
}
	
