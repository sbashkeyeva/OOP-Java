package revise;

public class PalindromeString {
	public static boolean checking(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String res=sb.toString();
		if(res.equals(s))
		{
			return true;
		}
		else 
			return false;
		
	}

}
