package lab1_2;
import java.util.Scanner;

public class gradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade;
		Scanner sc =new Scanner(System.in);
		grade=sc.nextDouble();
		if(grade>=95 )
		{
			System.out.println("A");
		}
		if(grade>=90 && grade<95)
		{
			System.out.println("-A");
		}
		if(grade>=85 && grade<90)
		{
			System.out.println("+B");
		}
		if(grade>=80 && grade<85)
		{
			System.out.println("B");
		}
		if(grade>=75 && grade<80)
		{
			System.out.println("-B");
		}
		if(grade>=70 && grade<75)
		{
			System.out.println("+C");
		}
		if(grade>=65 && grade<70)
		{
			System.out.println("C");
		}
		if(grade>=60 && grade<65)
		{
			System.out.println("-C");
		}
		if(grade>=55 && grade<60)
		{
			System.out.println("+D");
		}
		if(grade>=50 && grade<55)
		{
			System.out.println("D");
		}
		if(grade<50)
		{
			System.out.println("FAIL");
		}

	}

}
