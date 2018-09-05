package task3;
import java.util.Date;

import java.util.Vector;
public class Manager extends Employee implements Comparable,Cloneable {
	
	public double bonus;
	public Manager()
	{
		
	}
	public Manager(String name,Date d, String insuranceNumber,double newSalary,int newBonus)
	{
		super(name,d,insuranceNumber,newSalary);
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
	public Manager clone() throws CloneNotSupportedException
	{
		return (Manager) super.clone();
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Manager a=(Manager)o;
		if(super.compareTo(a)==0) {
			if(bonus>a.bonus)
				return 1;
			if(bonus<a.bonus)
				return -1;
			return 0;
		}
		return super.compareTo(a);
		
	}
	
	

	

}
