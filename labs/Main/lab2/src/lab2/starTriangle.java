package lab2;

public class starTriangle {
	private static int width;
	public starTriangle(int widthN)
	{
		width=widthN;
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<width;i++) {
			for(int j=0;j<=i;j++) {
				s+="[*]";
			}
			s+="\n";
		}
		return s;
	}


}
