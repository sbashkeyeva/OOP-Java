package task3;

import java.util.Date;

public class TestTask3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Person p =new Person("hvjhbh");
		
		Person q = (Person)p.clone();
		p.setname("qwerty");
		System.out.println(q.toString());
		Employee e =new Employee();
		Manager manager=new Manager();
		Employee emp =new Employee("Natasha",new Date(2017),"127",500000);
		Employee emp2=new Employee("Alexandra",new Date(2015),"450",700000);
		manager.team.add(emp);
		manager.team.add(emp2);
		Manager m1=new Manager("Natasha",new Date(2017),"127",500000,50);
		
		Manager m2=new Manager("Alexandra",new Date(2015),"450",700000,70);
		emp2 = emp.clone();
		
		//System.out.println(m1.compareTo(m2));
		//System.out.println(emp.toString());
		//System.out.println(emp2.toString());
	}

}
