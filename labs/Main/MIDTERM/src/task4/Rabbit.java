package task4;

public class Rabbit implements Runnable {

	public int speed=0;
	public int x;
	public int y;
	public Rabbit()
	{
		x=0;
		y=0;
	}
	public Rabbit(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x=x;
		this.y=y;
		
	}
	public String toString()
	{
		return x +" "+y;
	}
	@Override
	public String getRoad() {
		// TODO Auto-generated method stub
		return x + " "+y;
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed+=increment;
	}
	
    
	
	

}
