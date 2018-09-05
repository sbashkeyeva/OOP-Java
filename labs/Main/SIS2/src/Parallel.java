
public class Parallel extends Circuit{
	private Circuit a;
	private Circuit b;
	public Parallel(Circuit a,Circuit b)
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return (a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance());
	}

	@Override
	public double getPottential() {
		// TODO Auto-generated method stub
		return a.getPottential();
	}

	@Override
	public void applyPottentialDiff(double v) {
		// TODO Auto-generated method stub
		a.applyPottentialDiff(v);
		b.applyPottentialDiff(v);
		
	}
	

}
