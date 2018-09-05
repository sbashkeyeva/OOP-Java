package task4;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit r=new Rabbit();
		r.move(5,6);
		System.out.println(r);
		
		System.out.println(r.getRoad());
		r.SpeedUp(9);
		System.out.println(r);

	}

}
