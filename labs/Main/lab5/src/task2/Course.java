package task2;
import java.util.*;
import java.io.Serializable;
public class Course implements Serializable {
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;
	public Course()
	{
		
	}
	public Course(String cousreTitle, Textbook tb, Instructor i)
	{
		this.courseTitle=courseTitle;
		this.textbook=tb;
		this.instructor=i;
	}
	public String toString()
	{
		return textbook.getTitle()+" "+instructor.getFullName();
	}
	public boolean equals(Object o)
	{
		if(this.getClass()!=o.getClass() || o==null) return false;
		Course c=(Course)o;
		if(c.courseTitle.equals(courseTitle)) return true;
		return false;
	}
}
