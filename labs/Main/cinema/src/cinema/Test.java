package cinema;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Test {
	public static void printInfo(Room r)
	{
		System.out.println("Cost:" + r.getCost()+", "+"Description:"+r.getDescription());
	}
	//public static void save()
	//{
	//	Manager.save(Users);
	//}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Map <String, Cinema> cinema = Cinema.getCinema();
	    Room r=new SimpleRoom();
	    printInfo(r);
	    r=(Room) new VIP(r);
	    printInfo(r);
	    r=(Room) new ThreeD(r);
	    printInfo(r);
	    /*Manager admin = new Manager("admin", 0);
		admin.des();
		System.out.println("Welcome to Booking");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please choose function:");
			System.out.println("1) Create user or 2) login");
			int next = sc.nextInt();
			if (next == 1) {
				String name = sc.nextLine();
				admin.addUser(name);
			}
		}*/
		//admin.save();
		//sc.close();
	    Cinema.save(cinema);

	}

}
