package lab1_4;
import java.util.Scanner;
public class quadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		double d=(b*b-4*a*c);
		if(d>0)
		{
			double x1=(-b+Math.sqrt(d))/(2*a);
			double x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println(x1+" "+x2);
		}
		if(d<0)
		{
			System.out.println("Error");
		}
		if(d==0)
		{
			double x=(-b)/(2*a);
			System.out.println(x);
		}
		
		

	}

}
