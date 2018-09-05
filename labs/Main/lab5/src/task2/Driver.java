package task2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Driver {

public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Scanner sc = new Scanner (System.in);
		Map <String, Course> courses = Mode.getCourses();
		while (true) {
			System.out.println("You should choose mode: <admin> or <user> or <q> for exit");
			String chooseMode = sc.nextLine();
			if (chooseMode.equals("user")) {
				System.out.println("Enter <a> to look into the list of courses or <b> otherwise");
				chooseMode = sc.nextLine();
				if (chooseMode.equals("a")) {
					System.out.println ("courses are listed below:");
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
						System.out.println ("This course doesn't exist");
					}
				}
			}
			else if (chooseMode.equals("admin")){
				System.out.println("You should enter username:");
				String userName = sc.nextLine();
				System.out.println("You should enter password:");
				String password = sc.nextLine();
				Mode.addData("user: " + userName);
				Mode.addData("password: " + password.hashCode());
				Mode.addData("user logged in");
				while (true) {
					System.out.println("Choose mode: <a> add course <q> quit");
					String nxt = sc.nextLine();
					if (nxt.equals("a")) {
						System.out.println("You should enter instructor");
						Instructor ins = new Instructor();
						
						System.out.println("email:");
						String nx = sc.nextLine();
						ins.setEmail(nx);
						System.out.println("department:");
						nx = sc.nextLine();
						ins.setDepartment(nx);
						System.out.println("firtname and lastname:");
						nx = sc.nextLine();
						ins.setFullName(nx);
						
						System.out.println("You should enter textbook");
						Textbook textbook = new Textbook();
						System.out.println("This is the isbn:");
						nx = sc.nextLine();
						textbook.setIsbn(nx);
						System.out.println("This is the author:");
						nx = sc.nextLine();					
						textbook.setAuthor(nx);
						System.out.println("This is the title:");
						nx = sc.nextLine();					
						textbook.setTitle(nx);
						System.out.println("PLease Enter title of course");
						String title = sc.nextLine();
						
						Course c = new Course (title, textbook, ins);
						System.out.println(c);
						courses.put(title, c);
						Mode.addData("added course " + title + " ");
					}
					else if (nxt.equals("q")) {
						break;
					}
				}
			}
			else {
				Mode.saveCourses(courses);
				break;
			}
		}
	}

}
