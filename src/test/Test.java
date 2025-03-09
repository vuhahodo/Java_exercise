package test;

public class Test extends Thread {
	private static final Object lock = new Object();
	public Test() {
		
	}
	public void run() {
		synchronized(lock) {
			for(int i = 0; i < 10; i++) {
			System.out.println(i + " ");
		}
		try {
			lock.wait();
		} catch (Exception e) {
			System.out.println("Error");
		}
		lock.notify();
		}
		
	}
	
	public static void main(String[] args) {
		Test a = new Test();
		Test b = new Test();
		a.start();
		b.start();
	}

}
