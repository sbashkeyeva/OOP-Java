package revise;

public class MyPoint {
	private int x;
	private int y;
	MyPoint(int dx, int dy)
	{
		this.x=dx;
		this.y=dy;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyPoint[] points=new MyPoint[10];
       for(int i=0;i<points.length;i++)
       {
    	     points[i]=new MyPoint(1,5);
    	     while((points.length)!=0) {
    	    	 System.out.println(points);
    	     }
       }
       
       
	}

}
