
public class Car {
	public double fuelEff;
	public double fuelTank;
	public Car()
	{
		
	}
	public Car(double fuel, double eff)
	{
		this.fuelEff=eff;
		this.fuelTank=fuel;
	}
	public void drive(double dis)
	{
		fuelTank = fuelTank - dis/fuelEff;
	}
	public double getGasInTank(int y)
	{
		return fuelTank;
	}
	public void addGas(double gasoline) 
	{
		fuelTank += gasoline;
		
	}
}
