package lab2;

public class Converter {
	String[] simple = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] hard = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	private String Under100(int x)
	{
		int location =x/10;
		int location2=x%10;
		if(x<20)
			return simple[x];
		return hard[location-2]+" "+simple[location2];
				
	}
	private String Under1000(int x)
	{
		int location =x/100;
		int location2=x%100;
		if(x>=100)
			return simple[location]+" hundred "+Under100(location2);
		else
			return Under100(x);
	}
	private String Under10000(int x)
	{
		int location=x/1000;
		int location2=x%1000;
		if(x>=1000)
			return simple[location]+" thousand  "+Under1000(location2);
		else 
			return Under1000(x);
			
	}
	
	public String inWord(int x)
	{
		return Under10000(x);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter c=new Converter();
		System.out.println(c.inWord(9990));

	}

}
