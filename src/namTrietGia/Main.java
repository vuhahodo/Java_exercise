package namTrietGia;

import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		int tongSoTrietGia = 5;
		TrietGia[] trietGia = new TrietGia[tongSoTrietGia];
		Semaphore[] dua = new Semaphore[tongSoTrietGia]; 
		
		for (int i = 0; i < tongSoTrietGia; i++) {
			dua[i] = new Semaphore(1);
		}
		
		for(int i = 0; i < tongSoTrietGia; i++) {
			Semaphore leftChops = dua[i];
			Semaphore rightChops = dua[(i+1)%tongSoTrietGia];
			
			if(i < tongSoTrietGia-1) {
				trietGia[i] = new TrietGia(i, leftChops, rightChops);
			}else {
				trietGia[i] = new TrietGia(i, rightChops, leftChops);
			}
			
			Thread t = new Thread(trietGia[i]);
			t.start();
		}
	}
}