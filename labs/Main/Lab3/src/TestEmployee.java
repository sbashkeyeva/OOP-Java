
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person =new Person();
		Employee employee =new Employee();
		Manager manager=new Manager();
		Employee emp =new Employee("Natasha",4,"127",500000);
		Employee emp2=new Employee("Alexandra",3,"450",700000);
		manager.team.add(emp);
		manager.team.add(emp2);
		
		
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		

	}

}
