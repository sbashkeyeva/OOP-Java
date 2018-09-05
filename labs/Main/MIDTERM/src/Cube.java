
public class Cube implements Shapes {
	public double a;
	public Cube()
	{
		
	}
	public Cube(double x)
	{
		this.a=x;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return a*a*a;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return a*a;
	}

}
