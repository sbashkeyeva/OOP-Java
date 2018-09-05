package preperation;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
		Circle z=new Circle(9);
		System.out.println(c.compareTo(z));
		c.getArea();
		System.out.println(c.hashCode("Symbat"));
		System.out.println(c.equals(z));
	}

}
