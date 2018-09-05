package task3;

public class Person implements Comparable,Cloneable {
	public String name="";
	public Person()
	{
		
	}
	public Person clone() throws CloneNotSupportedException
	{
		Person tmp = (Person)super.clone();
		return tmp;
	}
	public Person(String newName)
	{
		name=newName;
	}
	public void setname(String s) {
		this.name=s;
	}
	public String toString()
	{
		return name;
	}
	public boolean equals(Person Larisa)
	{
		return name.equals(Larisa.name);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
