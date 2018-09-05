import java.lang.*;
import java.util.*;

/**
 */
public class Faculty {
    /**
     */
    private Vector<Student> students;

    /**
     */
    private Vector<Teacher> teachers;

    public Faculty(Vector<Student> students, Vector<Teacher> teachers, String name) {
        this.students = students;
        this.teachers = teachers;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculty [students=" + students + ", teachers=" + teachers + ", name=" + name + "]";
    }

    /**
     */
    private String name;

    /**
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
    }

    /**
     * @param name
     */
    public void eraseTeacher(String name) {
    }

    /**
     * @param student
     */
    public void addStudent(Student student) {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((students == null) ? 0 : students.hashCode());
        result = prime * result + ((teachers == null) ? 0 : teachers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Faculty other = (Faculty) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (students == null) {
            if (other.students != null)
                return false;
        } else if (!students.equals(other.students))
            return false;
        if (teachers == null) {
            if (other.teachers != null)
                return false;
        } else if (!teachers.equals(other.teachers))
            return false;
        return true;
    }

    /**
     * @param name
     */
    public void eraseStudent(String name) {
    }

    /**
     */
    public void showTeachers() {
    }

    /**
     */
    public void showStudents() {
    }
}