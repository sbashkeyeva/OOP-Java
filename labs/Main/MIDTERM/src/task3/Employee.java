package task3;
import java.util.Date;

public class Employee extends Person implements Cloneable {
	public double salary;
	public String insuranceNumber;
	public Date hireDate;
	public Employee()
	{
		
	}
	public Employee clone() throws CloneNotSupportedException
	{   Employee emp = (Employee)super.clone();
		return emp;
	}
	public Employee(String name,Date d, String newInsuranceNumber, double newSalary)
	{
		super(name);
		hireDate=d;
		insuranceNumber=newInsuranceNumber;
		salary=newSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"year "+hireDate+" InsuranceNumber"+insuranceNumber+" salary "+salary;
	}
	
	public boolean equals(Employee e) {
		// TODO Auto-generated method stub
		return super.equals(e) && this.hireDate==e.hireDate && this.insuranceNumber==e.insuranceNumber && this.salary==e.salary;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee e=(Employee)o;
		if(salary>e.salary)
			return 1;
		if(salary==e.salary)
			return 0;
		return -1;
	}

}
