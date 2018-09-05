import java.util.Date;
import java.util.Random;

public class WarThread extends Thread{

	private String countryName;
	private int resource;
	private Random random = new Random();
	private int x;
	private boolean[] enemiesSectors;
	
	public WarThread(String countryName,int numberOfEnemiesSector) 
	{
		this.countryName=countryName;
		this.enemiesSectors = new boolean[numberOfEnemiesSector];
	}
	
	public void setResource(int resource)
	{
		this.resource=resource;
	}
	
	public void run(){
		for(int i=0; i<Integer.MAX_VALUE; i++){
			try {
				Thread.sleep(500);
				shoot();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void shoot(){
		

		x = random.nextInt(enemiesSectors.length);
		System.out.println(" "+this.countryName+ " shooted enemies sector number: " + (x+1));
		enemiesSectors[x]=true;
			
		resource-=100;
		System.out.println(" "+this.countryName+" finished shooting, at moment... >>>"+(new Date())+", current resource: "+resource);
		
		if (checkArray(enemiesSectors)){
			System.out.println(" " + this.countryName + " won this war, because of all enemies target are eliminated .");
			System.exit(0);
	    }
		
		if(resource<=0) {
			System.out.println("There is no any resource left! " + this.countryName + "losed this war.");
			System.exit(0);
		}
		

	}
	
	public synchronized boolean checkArray(boolean[] checked){
	    for (boolean b : checked) {
	        if (!b) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
