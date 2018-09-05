
public class Employee extends Person {
	public double salary;
	public String insuranceNumber;
	public int year;
	public Employee()
	{
		
	}
	public Employee(String name,int newYear, String newInsuranceNumber, double newSalary)
	{
		super(name);
		year=newYear;
		insuranceNumber=newInsuranceNumber;
		salary=newSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"year "+year+" InsuranceNumber"+insuranceNumber+" salary "+salary;
	}
	
	public boolean equals(Employee e) {
		// TODO Auto-generated method stub
		return super.equals(e) && this.year==e.year && this.insuranceNumber==e.insuranceNumber && this.salary==e.salary;
	}

}
