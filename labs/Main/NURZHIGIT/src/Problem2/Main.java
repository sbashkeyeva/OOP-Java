package Problem2;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StringTokenizer token;
		String login, password;
		//	String name = reader.readLine();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean bl = false;
		ArrayList<Course> courses = new ArrayList<>();
		Date myDate = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose admin or user: 1.Admin 2.User");
		int n = sc.nextInt();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(n == 1) {
			System.out.println("Admin Module");
			System.out.println("Login: ");
			login = sc.next();
			System.out.println("Password: ");
			
			password = sc.next();	
			BufferedReader br = new BufferedReader(new FileReader("admin.txt"));
			
			try{
				String line = br.readLine();
		        while(line != null){
		        	token = new StringTokenizer(line, " ", false);
		        	String log = token.nextToken();
		        	String pw = token.nextToken();
		        	if(login.equals(log) && pw.equals(password)) {
		        		bl = true;
		        		break;
		        	}
		        	line = br.readLine();
		        }
		        if(!bl) {
		        	System.out.println("Invalid Error");
		        }
		        try {
		            FileInputStream streamIn = new FileInputStream("D:\\course.txt");
		            ObjectInputStream objectinputstream = null; 
		            try {
		                objectinputstream = new ObjectInputStream(streamIn);
		                courses = (ArrayList<Course>) objectinputstream.readObject();
		            } catch (EOFException  e) {
		                e.printStackTrace();
		            }finally {
		                if(objectinputstream != null){
		                    objectinputstream .close();
		                }
		            }
		            for(int i = 0; i < courses.size();i++) {
		            	System.out.println(courses.get(i).toString());
		            }
		            while(true) {
		            	System.out.println("If you want add new course? Type: Yes or No");
		            	String add = sc.next();		            
			            if (add.equals("Yes")) {
			                System.out.println("Enter name of course:");
			                String courseTitle = in.readLine();
			                if (!courseTitle.isEmpty()) {
			                
			                    Course course = new Course();
			                  //course.setMyDate(myDate);
			                    course.setCourseTitle(courseTitle);
			                    System.out.println("Enter information about instructor:");
			                    System.out.print("Enter name:");
			                    String name = in.readLine();
			                    System.out.print("Enter last name:");
			                    String lastName = in.readLine();
			                    System.out.print("Enter department:");
			                    String department = in.readLine();
			                    System.out.print("Enter email:");
			                    String email = in.readLine();
			                    
			                    Instructor instructor = new Instructor(name, lastName, department, email);
			                    course.setInstructor(instructor);
			                    System.out.println(course.toString());
			                    System.out.println("Enter information about textbook:");
			                    System.out.print("Enter title:");
			                    String title = in.readLine();
			                    System.out.print("Enter ISBN:");
			                    String isbn = in.readLine();
			                    System.out.print("Enter author:");
			                    String author = in.readLine();
			                    
			                    Textbook textbook = new Textbook(isbn, title, author);
			                    course.setTextbook(textbook);
			                    System.out.println(course.toString());
			                    course.toString();
			                    courses.add(course);
			                    System.out.println();
			                }
			                
		            	}
			            else {
		                	break;
		                }
		                FileOutputStream fout = new FileOutputStream("D:\\course.txt");
	                    ObjectOutputStream oos = new ObjectOutputStream(fout);
	                    oos.writeObject(courses);
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			}
			finally {
				out.close();
			}
			
		}
		else if(n == 2) {
			while(true){
				System.out.println("The user mode should offer the user choices to :");
				System.out.println("1) View the list of available courses");
				System.out.println("2) Display information about the course");
				int getModule = sc.nextInt();
				if(getModule == 1) {
					FileInputStream streamIn = new FileInputStream("D:\\course.txt");
		            ObjectInputStream objectinputstream = null; 
		            try {
		                objectinputstream = new ObjectInputStream(streamIn);
		                courses = (ArrayList<Course>) objectinputstream.readObject();
		                for(int i = 0; i < courses.size(); i++) {
		                	System.out.println(i+1+" "+courses.get(i).getCourseTitle().toString());
		                }
		            } catch (EOFException  e){
		                e.printStackTrace();
		            }finally {
		                if(objectinputstream != null){
		                    objectinputstream.close();
		                }
		            }
				}
				if(getModule == 2) {
					System.out.println("Print number of the course: ");
					int nCourse = sc.nextInt();
					FileInputStream streamIn = new FileInputStream("D:\\course.txt");
		            ObjectInputStream objectinputstream = null; 
		            
		            try {
		                objectinputstream = new ObjectInputStream(streamIn);
		                courses = (ArrayList<Course>) objectinputstream.readObject();
		                System.out.println(courses.get(nCourse).toString());
		             
		            } catch (EOFException  e) {
		                e.printStackTrace();
		            }finally {
		                if(objectinputstream != null){
		                    objectinputstream .close();
		                }
		            }
				}
				else {
					break;
				}	
				
			}
		}
	}
}