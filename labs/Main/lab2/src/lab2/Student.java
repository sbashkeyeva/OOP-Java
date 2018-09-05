package lab2;

public class Student {
	private String name, id;
	private int year = 1;
	
	public Student (String name, String id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void increment() {
		year++;
	}
	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Symbat","16BD02111");
		s.increment();
		s.setName("Aizhan");
		System.out.println(s.getName());
		System.out.println(s.year);
		System.out.println(s.getYear());
		
	}

}









