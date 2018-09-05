import java.util.*;
import java.util.Scanner; 
import java.io.*;
import java.io.*;


public class Japanese {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader f=new FileReader("/Users/symbatbashkeyeva/Desktop/kerel/vocab.txt");
		BufferedReader in = new BufferedReader(f);
		Set<String> wordSet=new HashSet<String>();
		
		while(in.readLine()!=null) {
			String s=in.readLine();
			int begining=0;
			for(int i=s.length()-1 ; i>=0 ; --i) {
				if(s.charAt(i)==' ')begining = i;
			}
			s=s.substring(begining+1, s.length()-1);
			wordSet.add(s);
			
		}
		Scanner sc=new Scanner(System.in);
		
		String ieroglif=sc.nextLine();
		 
		for(String s:wordSet) {
			int ok=1;
			for(int i=0 ; i<s.length() ; ++i) {
				int ok1=0;
				for(int j=0 ; j<ieroglif.length() ; ++j) {
					if(s.charAt(i)==ieroglif.charAt(j)) ok1=1;
				}
				if(ok1==0) ok=0;
			}
			if(ok==1) {
				System.out.println(s);
			}
		}
		
	}

}
