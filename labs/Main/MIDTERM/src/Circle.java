
public class Circle implements Comparable, GeometricObject {
	public double radius;
	public Circle()
	{
		radius=1;
	}
	public Circle (double rad)
	{
		this.radius=rad;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public void setRadius(double rad)
	{
		this.radius=rad;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public boolean equals(Object o)
	{
		if(o == this) return true;
		if(o==null || o.getClass()!=this.getClass())
			return false;
		Circle c=(Circle)o;
		if(c.radius==this.radius)
			return true;
		return false;
	}
	public int hashCode(String s)
	{
		int x=0;
		for(int i=0;i<s.length();i++)
		{
			x=x*31+s.charAt(i);
		}
		return x;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Circle s=(Circle)o;
		if(s.radius==radius)
			return 0;
		if(s.radius>radius)
			return 1;
		return -1;
			
	}
	

}
