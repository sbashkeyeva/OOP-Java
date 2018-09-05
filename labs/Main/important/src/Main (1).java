import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		SystemManager admin = new SystemManager("admin", 0);
		admin.inic();
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
		}
		admin.save();
		sc.close();
	}

}
