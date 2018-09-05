
public class Cylinder extends Shape {
	public final double PI=3.14;
	public double h;
	public double r;
	public Cylinder()
	{
		
	}
	public Cylinder(double x,double y)
	{
		h=x;
		r=y;
		
	}
	
	public double volume()
	{
		 return (Math.PI*r*r*h);
	}
	public double surfaceArea()
	{
		return (2*r*h);
	}

}
