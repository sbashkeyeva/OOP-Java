import java.util.*;
/**
 */
public class Student extends User{
    /**
     */
    Vector<Course> courses;
    String ID;
    public Student(String login, String password, String fullname, String id) {
        super(login, password, fullname);
        ID =id;
    }

    /**
     */
    public void seeMarks() {
    }

    /**
     */
    public void seeTeachers() {
    }

    /**
     */
    public void seeTeachersSchedule() {
    }

    /**
     */
    public void seeSchedule() {
    }


}

