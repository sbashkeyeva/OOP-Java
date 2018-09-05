package lab2;
import java.util.Scanner;
public class Arrays {
	public static int [] doubleArray(int [] a) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] Array=new int[n*2];
		
		return Array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] a = new int[n];
		int[] b= new int[n*2];
		for(int i=0;i<n;i++)
		{
			int j=i*2;
			a[i]=scan.nextInt();
			b[j]=a[i];
			
		}
		
		for(int i=0;i<n;i++)
		{
			int j=i*2+1;
			b[j]=a[i];
		}
		for(int i=0;i<n*2;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
