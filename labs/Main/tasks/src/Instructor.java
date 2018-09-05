
import java.io.Serializable;

public class Instructor implements Serializable {
    private String email, department, fullName;
    public String toString () {
        return email + " " + department + " " + fullName;
    }
    public Instructor() {
    	email = "";
    	department = "";
    	fullName = "";
    }
    public Instructor (String email, String department, String fullName) {
        this.email = email;
        this.department = department;
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass() || o == null)
            return false;
        Instructor t = (Instructor) o;
        if (!t.email.equals(email))
            return false;
        return true;
    }
}
