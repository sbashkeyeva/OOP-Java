
public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPottential();
	public abstract void applyPottentialDiff(double v);
	public double getPower()
	{
		return getPottential()*getPottential()/getResistance();
	}
	public double getCurrent()
	{
		return getPottential()/getResistance();
	}
	

}
