package Thread_ex1;

public class OddThread extends Thread {
    private final SharedPrinter printer;

    public OddThread(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            printer.printOdd(i);
        }
    }
}
	