package lab2;
import java.util.Scanner;
import java.util.Vector;
public class DragonLunch {
	public Vector<Person> people;
	
	public DragonLunch() 
	{
		people = new Vector<Person>();
	}
	
	public void kidnap(Person aizhanchiki)
	{
		people.add(aizhanchiki);
	}
	
	
	public boolean WillDragonEatOrNot()
	{
		int count = 0;
		for (int i=0;i<people.size();i++) {
			
			 if (people.get(i).g == Gender.BOY ) count++;
			 else count--;
			 
			// if (count<0) return true; 
		}
		return count!=0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonLunch d=new DragonLunch();
		Person Aizhan=new Person(Gender.GIRL);
		Person Elibay=new Person(Gender.BOY);
		Person Kemal=new Person(Gender.BOY);	
		Person Danara=new Person(Gender.GIRL);
		Person Beka = new Person(Gender.BOY);
		Person Symbat = new Person(Gender.GIRL);
		d.kidnap(Elibay);
		d.kidnap(Aizhan);
		d.kidnap(Kemal);
		d.kidnap(Danara);
		d.kidnap(Beka);
		d.kidnap(Symbat);
		System.out.println(d.WillDragonEatOrNot());
		
		
	}
	
	
}	
