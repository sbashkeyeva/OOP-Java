package preperation;

public class Circle implements Comparable {
	public double area;
	public double radius=1.0;
	public String color="red";
	public Circle()
	{
		
	}
	/*public boolean equals (Object o) {
		if (o == null || o.getClass() != this.getClass())
			return false;
		Circle s = (Circle) o;
		if (s.radius == this.radius)
			return true;
		return false;
	}*/
	
	public Circle(double r)
	{
		this.radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void getArea()
	{
		area=radius*radius;
		System.out.println(area);
	}
	/*public int hashCode (String s) {
		int x = 0;
		for (int i = 0; i < s.length(); ++ i) {
			x = x * 37 + s.charAt(i);
		}
		return x;
	}*/
	@Override
	 /*public int compareTo(Object o) {
		Circle c = (Circle) o;
		if (c.radius > radius)
			return 1;
		if (c.radius == radius)
			return 0;
		return -1;	
	}*/
	public int compareTo(Object o)
	{
		Circle c=(Circle)o;
		if(c.radius==radius)
			return 0;
		if(c.radius>radius)
			return 1;
		return -1;
			
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
	
	public boolean equals(Object o)
	{
		if(o==null || o.getClass()!=this.getClass())
			return false;
		Circle c=(Circle)o;
		if(c.radius==this.radius)
			return true;
		return false;
	}
	
	

}
