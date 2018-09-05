package task2;

public class Instructor {
	String fullName;
	String department;
	String email;
	public Instructor()
	{
		
	}
	public Instructor(String email,String department,String fullName)
	{
		this.fullName=fullName;
		this.department=department;
		this.email=email;
	}
	String getFullName()
	{
		return fullName;
	}
	
	String getDepartnent()
	{
		return department;
	}
	String getEmail()
	{
		return email;
	}
	void setFullName(String fullName)
	{
		this.fullName=fullName;
	}
	void setDepartment(String department)
	{
		this.department=department;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	public boolean equals(Object o)
	{
		if(this.getClass()!=o.getClass() || o==null) return false;
		Instructor i=(Instructor)o;
		if(i.email.equals(email)) return true;
		return false;
	}
	public String toString()
	{
		return email+" "+department+" "+fullName;
	}

}
