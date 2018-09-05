package revise;

public class UpperCase {
	public static String toUpCase(String s)
	{
		String arr[]=s.split("\\s");
		String capitalized="";
	    for(String ss:arr)
	    {
	    	   String firstWord=ss.substring(0,1);
	    	   String afterFirstWord=ss.substring(1);
	    	   capitalized+=firstWord.toUpperCase()+afterFirstWord+" ";
	    }
		return capitalized;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UpperCase.toUpCase("bashkeyeva symbat batyrbekkyzy"));

	}

}
