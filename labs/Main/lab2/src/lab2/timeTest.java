package lab2;

public class timeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(12,9,8);
		Time t2=new Time(8,8,7);
		System.out.println(t.toUniversal());
	    t.Add(t2);
		System.out.println(t.toStandard());
		
		
	}

}
