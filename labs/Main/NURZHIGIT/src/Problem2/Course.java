package Problem2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Course implements Serializable{
	private String courseTitle;
	private Textbook textbook;
	private Instructor instructor;
	Date myDate = new Date();
	
	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	@Override
	public String toString() {
		return "Course [Date: " + myDate + "courseTitle = " + courseTitle + ", textbook = " + textbook + ", instructor = " + instructor + "]";
	}
	public Date getMyDate() {
		return myDate;
	}
	public void setMyDate(Date myDate) {
		this.myDate = myDate;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public Textbook getTextbook() {
		return textbook;
	}
	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseTitle == null) ? 0 : courseTitle.hashCode());
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((textbook == null) ? 0 : textbook.hashCode());
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
		Course other = (Course) obj;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (textbook == null) {
			if (other.textbook != null)
				return false;
		} else if (!textbook.equals(other.textbook))
			return false;
		return true;
	}
	
	
	
}
