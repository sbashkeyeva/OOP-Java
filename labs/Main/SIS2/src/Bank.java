import java.util.Vector;
public class Bank {
	Vector <Account> oj=new Vector <Account>();
	public void update()
	{
		for(int i=0;i<oj.size();i++)
		{
			oj.get(i).update();
		}
	}
	public void open(Account other)
	{
		oj.addElement(other);
	}
	public void close(Account other)
	{
		oj.remove(other);
	}

}
