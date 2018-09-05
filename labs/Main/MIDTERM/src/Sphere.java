
public class Sphere implements Shapes {
    public double radius;
    public Sphere()
    {
    	
    }
    public Sphere(double r)
    {
      	this.radius=r;
    }
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*radius*radius*radius;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
