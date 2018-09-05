
public class Cylinder implements Shapes {
	public double radius;
	public double height;
	public Cylinder()
	{
		
	}
	public Cylinder(double r,double h)
	{
		this.radius=r;
		this.height=h;
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius*height;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return 2*radius*height;
	}

}
