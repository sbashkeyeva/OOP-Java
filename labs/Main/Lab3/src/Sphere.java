
public class Sphere extends Shape{
	public double r;
	public Sphere()
	{
		
	}
	public Sphere(double x)
	{
		double r=x;
	}
	public double volume()
	{
		return (Math.PI*r*r*r*4/3);
	}
	public double surfaceArea()
	{
		return (Math.PI*r*r);
	}

	

}
