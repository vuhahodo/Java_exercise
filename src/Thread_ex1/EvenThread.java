package Thread_ex1;

public class EvenThread extends Thread {
    private final SharedPrinter printer;

    public EvenThread(SharedPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            printer.printEven(i);
        }
    }
}
