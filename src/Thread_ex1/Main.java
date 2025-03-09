package Thread_ex1;

public class Main {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        Thread oddThread = new OddThread(printer);
        Thread evenThread = new EvenThread(printer);

        oddThread.start();
        evenThread.start();
    }
}

