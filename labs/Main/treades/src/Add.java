
import java.util.Date;

public class Sadovnik extends Thread {
	public Sadovnik(String name){
		this.setName(name);
	}
	static int[][] area = new int[][]{
		  { 0, 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0, 0},
		  { 0, 0, 0, 0, 0, 0}
	};	
	static int x1=0, y1=0, x2=5, y2=5;
	
	static synchronized void f(){
		if(Thread.currentThread().getName() == "pervyi") {
		if(x1 < 6 && area[x1][y1] != 1) {
			area[x1][y1] = 1;
			
			System.out.println(Thread.currentThread().getName() +" posadil" + " " + x1 +" " +y1 + "\n");
			x1++;
		}
		else {
			x1 = 0;
			y1++;
			//if(y1 >= 6) Thread.currentThread().stop();
		}
			
		
		
		
		}
		else {
			if(y2 >= 0 && area[x2][y2] != 1) {
				area[x2][y2] = 1;
				
				System.out.println(Thread.currentThread().getName() +" posadil" + " " + x2 +" " +y2 + "\n");
				y2--;
			}
			else {
				x2--;
				y2 = 5;
				//if(x1 <= 0) Thread.currentThread().stop();
			}
			
			
			
			
		}
	}
	static synchronized void f2(){
		
		if(y2 >= 0 && area[x2][y2] != 1) {
			area[x2][y2] = 1;
			y2--;
		}
		else {
			x2--;
			y2 = 5;
			if(x1 <= 0) Thread.currentThread().stop();
		}
		
		
		
		System.out.println(Thread.currentThread().getName() +" posadil" + " " + x2 +" " +y2 + "\n");
	}
	
	public void run(){
		while(area[0][5] != 1) {
		
			f();
		
		}		
	}
}
