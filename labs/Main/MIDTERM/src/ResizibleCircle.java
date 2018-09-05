
public class ResizibleCircle extends Circle implements Resizable {
	public int persent;
	public ResizibleCircle()
	{
		
	}
	public ResizibleCircle(double rad)
	{
		super();
	}
	public void resize(int persent)
	{
		 radius=radius*persent/100;
	}
}
