import java.util.*;

public class CourseType {
    TypeOfCourse type;
    Teacher teacher;
    int room;
    Time time;
    HashMap<Student,Mark> students;
    Vector<CourseFiles> courseFiles = new Vector<CourseFiles>();

    CourseType(TypeOfCourse type, Teacher teacher, int room, Time time, HashMap<Student,Mark> students){
        this.type=type;
        this.teacher=teacher;
        this.room = room;
        this.time = time;
        this.students = students;
    }

    public HashMap<Student, Mark> getStudents() {
        return students;
    }

    public int getRoom() {
        return room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Time getTime() {
        return time;
    }

    public String getType() {
        if(type==TypeOfCourse.Lecture)return "Lecture";
        if(type==TypeOfCourse.Lab)return "Lab";
        return "Practical";
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public void setStudents(HashMap<Student, Mark> students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setType(TypeOfCourse type) {
        this.type = type;
    }

    public Vector<CourseFiles> getCourseFiles() {
        return courseFiles;
    }

    public void setCourseFiles(Vector<CourseFiles> courseFiles) {
        this.courseFiles = courseFiles;
    }
}
