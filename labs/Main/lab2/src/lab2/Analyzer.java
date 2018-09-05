package lab2;
import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Data d=new Data();
		String cur = scan.next();
		while(!cur.equals("Q"))
		{	
			int value = Integer.parseInt(cur);
			d.Add(value);
			cur = scan.next();
		}
		System.out.println(d.getAverage());
		System.out.println(d.getMax());

	}

}
