package lab1_5;
import java.util.Scanner;

public class definingSquaresParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double area=a*a;
		double perimeter=4*a;
		double diagonal=a*(Math.sqrt(2));
		System.out.println( area +" "+ perimeter+ " "+ diagonal);

	}

}
