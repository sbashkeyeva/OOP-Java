
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ClassDriver {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("lol".hashCode());
		Map <String, Course> courses = AdminMode.getCourses();
//		courses.put("OOP", a);
		while (true) {
			System.out.println("Please choose mode: User or Admin or (q) for exit");
			String chooseMode = sc.nextLine();
			if (chooseMode.equals("user")) {
				System.out.println("Enter (a) for view list of courses or (b) other case");
				chooseMode = sc.nextLine();
				if (chooseMode.equals("a")) {
					System.out.println ("Aviable courses:");
					for (String key: courses.keySet()) { 
						System.out.println(key);
					} 
				}
				else {
					String nameOfCourse = sc.nextLine();
					Course course = courses.get(nameOfCourse);
					if (course != null) {
						System.out.println(course);
					}
					else {
						System.out.println ("Incorect course");
					}
				}
			}
			else if (chooseMode.equals("admin")){
				System.out.println("Please enter username:");
				String userName = sc.nextLine();
				System.out.println("Please enter password:");
				String password = sc.nextLine();
				AdminMode.addData("user: " + userName);
				AdminMode.addData("password: " + password.hashCode());
				AdminMode.addData("user logged in");
				while (true) {
					System.out.println("Choose mode: (a) add course (q) quit");
					String nxt = sc.nextLine();
					if (nxt.equals("a")) {
						System.out.println("Please enter instructor");
						Instructor ins = new Instructor();
						
						System.out.println("email:");
						String nx = sc.nextLine();
						ins.setEmail(nx);
						System.out.println("department:");
						nx = sc.nextLine();
						ins.setDepartment(nx);
						System.out.println("name surname:");
						nx = sc.nextLine();
						ins.setFullName(nx);
						
						System.out.println("Please enter textbook");
						Textbook textbook = new Textbook();
						System.out.println("isbn:");
						nx = sc.nextLine();
						textbook.setIsbn(nx);
						System.out.println("author:");
						nx = sc.nextLine();					
						textbook.setAuthor(nx);
						System.out.println("title:");
						nx = sc.nextLine();					
						textbook.setTitle(nx);
						System.out.println("Enter title of course");
						String title = sc.nextLine();
						
						Course c = new Course (title, textbook, ins);
						System.out.println(c);
						courses.put(title, c);
						AdminMode.addData("added course " + title + " ");
					}
					else if (nxt.equals("q")) {
						break;
					}
				}
			}
			else {
				AdminMode.saveCourses(courses);
				break;
			}
		}
	}

}
