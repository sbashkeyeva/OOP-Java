package revise;

public class ReversedString {
   public static String reverse(String s)
   {
	   String arrayString[] =s.split("oo");
	   String result="";
	   for(String probeg: arrayString)
	   {
		   StringBuilder sb=new StringBuilder(probeg);
		   sb.reverse();
		   result+=sb.toString()+" ";
	   }
	   return result;
   }
}
