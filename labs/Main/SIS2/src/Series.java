
public class Series extends Circuit {
	private Circuit a;
	private Circuit b;
	public Series(Circuit a, Circuit b)
	{
		this.a=a;
		this.b=b;
	}

	public double getResistance() {
		// TODO Auto-generated method stub
		return a.getResistance()+b.getResistance();
		
	}

	@Override
	public double getPottential() {
		// TODO Auto-generated method stub
		return a.getPottential()+b.getPottential();
	}

	@Override
	public void applyPottentialDiff(double v) {
		double i=(v/getResistance());
		// TODO Auto-generated method stub
		a.applyPottentialDiff(i*a.getResistance());
		b.applyPottentialDiff(i*b.getResistance());
	}
	

}
