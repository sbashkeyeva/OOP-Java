package lab2;

public class Data {
	private int numberOfNumbers ;
	private double sum ;
	private double max=Integer.MIN_VALUE;
	public Data()
	{
		
	}
	public void Add(int value)
	{
		numberOfNumbers++;
		sum+=value;
		if(max<value) max=value;
	}
	public double getMax()
	{
		return max;
	} 
	public double getAverage()
	{
		return sum/numberOfNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
