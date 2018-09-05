
public class Resistor extends Circuit{
	public double res;
	private double pottentialDifference;
	public Resistor(double r)
	{
		this.res=r;
	}
    
	public double getResistance() {
		return res;
	}
	public double setResistance(double r)
	{
		return res;
	}

	public double getPottential() {
		// TODO Auto-generated method stub
		return pottentialDifference ;
	}

	public void applyPottentialDiff(double v) {
		pottentialDifference=v;
		// TODO Auto-generated method stub
		
	}
	

}
