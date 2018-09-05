
public class Sadovnik extends Thread  {
	
	
	
	public Sadovnik(String name)
	{
		this.setName(name);
	}
	
	
	static int [][] ground =new int[5][5];
	{
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0},
		{0,0,0,0,0}
		
	};
	static int x1=0, x2=5, y1=0, y2=5;
	static synchronized void Function() {
		if(Thread.currentThread().getName()=="FirstSadovnik") {
			if(ground[x1][y1]!=1 && x1<=5 )
			{
				ground[x1][y1]=1;
			System.out.println(Thread.currentThread().getName()+" has plant in " +x1+ "and "+y1);
			x1++;
			}
			else
			{
				x1=0;
				y1++;
			}
		}
		else
		{
			if(y2>=0 && ground[x2][y2]!=1)
			{
				ground[x2][y2]=1;
			System.out.println(Thread.currentThread().getName()+" has plant in " +x2+ " and "+y2);
			y2--;
			}
			else
			{
				x2--;
				y2=5;
			}
		}
	}
	static synchronized void Fucntion2()
	{
		if(y2>0 && ground[x2][y2]!=1 )
		{
			ground[x2][y2]=1;
			y2--;
			
		}
		else {
			x2--;
			y2=5;
			if(x1<=0)
			{
				Thread.currentThread().stop();
			}
			System.out.println(Thread.currentThread().getName()+"has plant in "+x2+" and "+y2);
		}
		
	}
	public void run()
	{
		while(ground[0][5]!=1)
		{
			try {
				Thread.sleep(500);
				Function();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
