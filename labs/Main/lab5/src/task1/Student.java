package task1;

public class Student implements Comparable {
	public String name;
	public String secondName;
	public int grade;
	public static int sumOf;
	public static int bestGrade;
	Student()
	{
		
	}
	Student(String secondName, String name, String grade)
	{
		this.name=name;
		this.secondName=secondName;
		this.grade=Integer.parseInt(grade);
		sumOf+=this.grade;
		if(this.grade>bestGrade)
		{
			bestGrade=this.grade;
		}
	}
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		if(this.grade>s.grade)
			return 1;
		if(this.grade<s.grade)
			return -1;
		return 0;
	}
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		return (this.name.equals(s.name) && this.secondName.equals(s.secondName) && this.grade==s.grade );
	}
	public String toString()
	{
		char gpa=' ';
		if(bestGrade-grade<=10)
			gpa='A';
		else if(bestGrade-grade<=20)
			gpa='B';
		else if(bestGrade-grade<=30)
			gpa='C';
		else if(bestGrade-grade<=40)
			gpa='D';
		else 
			gpa='F';
		String s=name+"\t"+secondName+"\t\""+gpa+"\"";
		return s;
	}
	

}
