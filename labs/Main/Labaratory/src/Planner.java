import java.util.*;
public class Planner extends Thread{
	private static boolean A[] = new boolean[40];
	private static int time = 0;
	static Random r = new Random();
	
	
	public Planner(int t){
		time = t;
	}

	
	public synchronized void pour() {
		int a;
		while(true) {
			a = r.nextInt(40);
			if(checkArray(a, A)) {
				System.out.println(Thread.currentThread().getName()+"has plant");
				A[a] = true;
			}
		}
	}
	
	public void run() {
		for(int i=0; i < time; i++){
			try {
				Thread.sleep(1000, 3000);
				pour();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized boolean checkArray(int index, boolean A[]) {
		if(!A[index]) {
			return true;
		}
		return false;
	}
}
