package cinema;

public class Movie {
	public String name;
	public int time;
	public Movie()
	{
		
	}
	public Movie(String name, int time)
	{
		this.name=name;
		this.time=time;
	}
	public void setTitle(String name)
	{
		this.name=name;
	}
	public String getTitle(String name)
	{
		return name;
	}

}
