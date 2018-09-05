import java.util.Vector;
public class Manager extends Employee {
	public double bonus;
	public Manager()
	{
		
	}
	public Manager(String name,int year, String insuranceNumber,double newSalary,int newBonus)
	{
		super(name,year,insuranceNumber,newSalary);
	    this.bonus=newBonus;
		
	}
	Vector <Employee> team = new  Vector <Employee>();
	public double getBonus(double per)
	{
		bonus=salary*per/100;
		salary+=bonus;
		return salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+"bonus"+" "+bonus;
	}
	
	public boolean equals(Manager m) {
		// TODO Auto-generated method stub
		if(team.size()!=m.team.size())
		{
			return false;
		} else {
			
			for(int i = 0; i < team.size(); i++) {
				Employee e1=team.get(i);
				Employee e2=m.team.get(i);
				if(!(e1.equals(e2)))
					return false;
			}
		}
			
		return super.equals(m) && this.bonus==m.bonus;
		
	}
	

	

}
