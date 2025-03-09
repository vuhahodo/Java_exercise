package xuLyDeadLock_2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String[] args) {
		ReentrantLock res1 = new ReentrantLock();
		ReentrantLock res2 = new ReentrantLock();
		
		Thread t1 = new Thread(() -> {
			boolean isDone = false;
			while (!isDone) {
				try {
					if(res1.tryLock(1000, TimeUnit.MILLISECONDS)) {
						System.out.println("T1 đã lấy tài nguyên 1");
						Thread.sleep(1000);
						System.out.println("T1 yêu cầu tài nguyên 2");
						if(res2.tryLock(1000, TimeUnit.MILLISECONDS)) {
							System.out.println("T1 đã lấy tài nguyên 2");
							Thread.sleep(1000);
							System.out.println("T1 đã xử lý xong");
							isDone = true;
							res2.unlock();
							System.out.println("T1 đã thả tài nguyên 2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					res1.unlock();
					System.out.println("T1 đã thả tài nguyên 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(() ->{
			boolean isDone = false;
			while(!isDone) {
				try {
					if(res2.tryLock(1000, TimeUnit.MILLISECONDS)) {
						System.out.println("T2 đã lấy tài nguyên 2");
						Thread.sleep(1000);
						System.out.println("T2 yêu cầu tài nguyên 1");
						if(res1.tryLock(1000, TimeUnit.MILLISECONDS)) {
							System.out.println("T2 đã lấy tài nguyên 1");
							Thread.sleep(1000);
							System.out.println("T2 đã xử lý xong");
							isDone = true;
							res1.unlock();
							System.out.println("T2 đã thả tài nguyên 1");
						}
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}finally {
					res2.unlock();
					System.out.println("T2 đã thả tài nguyên 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}