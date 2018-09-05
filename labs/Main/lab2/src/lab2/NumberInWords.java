package lab2;

public class NumberInWords {
	String[] simple = {"","one","two","three","four","six","seven","eight","nine"};
	String[] hard = {"","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	String[] comf= {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public String getUnderHundred(int x)
	{
		String out="";
		if(x>=1000)
		{
			if(x/1000>=10 && x/1000<20)
			{
				out+=comf[x/1000-10];
			}
			if(x/1000>=20)
			{
				out+=hard[x/10000];
				out+=simple[x/1000%10];
			}
			if(x/1000<10)
			{
				out+=simple[x/1000];
			}
			out+="thousand";
			
			if(x%1000>=100)
			{
				out+=simple[x%1000/100]+"hundred";
				out+=hard[x%100/10];
				if(x%100>=10 && x%100<20)
				{
					out+=comf[x%100-10];
				}
				if(x%100>=20)
				{
					out+=hard[x%1000];
					out+=simple[x%10];
				}
			}
			if(x%1000<100) 
			{
				out+=hard[x%100/10];
				if(x%100>=10 && x%100<20)
				{
					out+=comf[x%100-10];
				}
				if(x%100>=20)
				{
					out+=hard[x%1000];
					out+=simple[x%10];
				}
			}
		}
		if (x<1000)
		{
			if(x>=100)
			{
				out+=simple[x/100]+"hundred";
				out+=hard[x%100/10];
				if(x%100>=10 && x%100<20)
				{
					out+=comf[x%100-10];
				}
				if(x%100>=20)
				{
					out+=hard[x];
					out+=simple[x%10];
				}
			}
			if(x<100) 
			{
				out+=hard[x%100/10];
				if(x%100>=10 && x%100<20)
				{
					out+=comf[x%100-10];
				}
				if(x%100>=20)
				{
					out+=hard[x];
					out+=simple[x%10];
				}
				
			}

		}
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberInWords a = new NumberInWords();
		System.out.println(a.getUnderHundred(9223));
	}

}
