package namTrietGia;

import java.util.concurrent.Semaphore;

public class TrietGia implements Runnable{
	
	private int id;
	private Semaphore leftChops;
	private Semaphore rightChops;
	
	public TrietGia(int id, Semaphore leftChops, Semaphore rightChops) {
		super();
		this.id = id;
		this.leftChops = leftChops;
		this.rightChops = rightChops;
	}

	@Override
	public void run() {
		while(true) {
			try {
				doSomething("suy nghĩ");
				leftChops.acquire();
				System.out.println(id + " lấy đũa trái!");
				rightChops.acquire();
				System.out.println(id + " lấy đũa phải!");
				doSomething("ăn");
				leftChops.release();
				rightChops.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}		
	}
	
	public void doSomething(String action) throws InterruptedException {
		System.out.println(this.id + " đang " + action);
		Thread.sleep((int)(Math.random()*10000));
	}
	
}