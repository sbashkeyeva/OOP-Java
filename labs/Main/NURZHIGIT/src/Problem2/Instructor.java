package Problem2;
import java.io.Serializable;
public class Instructor implements Serializable{
	private String firstName, lastName, department, email;

	public Instructor(String firstName, String lastName, String department, String email) {
		this.department = department;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void SetFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(!(o instanceof Instructor)) {
			return false;
		}
		Instructor i = (Instructor) o;		
		return i.firstName.equals(firstName) && i.lastName.equals(lastName) 
				&& i.department.equals(department) && i.email.equals(email);
	}
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", "
				+ "department: " + department + ", email: " + email;
	}
	public int hashCode() {
		int result = 11;
		result *=(firstName.length())%7 + (lastName.length())%7 + (department.length())%7 + (email.length()) % 7;
		return result;
	}
	
}
