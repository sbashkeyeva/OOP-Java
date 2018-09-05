
public class Cat extends Animal{
	public Cat()
	{
		this.sound  = "mew-mew";
	}
	public Cat(String name)
	{
		this();
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.sleep();
		return sound;
	}
	public String toString(String name) {
		// TODO Auto-generated method stub
		//return super.sleep();
		return  name + " " + this.toString();
	}
	
}
