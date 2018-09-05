
public class Temperature {
	public Double temperatureValue=0.0;
	public char scale='C';
	public Temperature(Double degree)
	{
		this.temperatureValue=degree;
		
	}
	public Temperature(char scale)
	{
		this.scale=scale;
	}
	public Temperature(Double degree,char scale)
	{
		this.temperatureValue=degree;
		this.scale=scale;
	}
	public Temperature()
	{
		
	}
	public double DegreesInCelsius()
	{
		if (scale == 'C')
			return temperatureValue;

		return 5*(temperatureValue-32)/9;
	}
	public double DegreesInFahrenheit()
	{
		if (scale == 'F')
			return temperatureValue;
		
		return 9*temperatureValue/5+32;
		
	}
	public void setValue(double degree)
	{
		temperatureValue = degree;
	}
	public void setScale(char scale)
	{
		this.scale = scale;
	}
	public void setBoth(double degree, char scale)
	{
		temperatureValue = degree;
		this.scale = scale;
	}
	public char getScale()
	{
		return scale;
	}


}
