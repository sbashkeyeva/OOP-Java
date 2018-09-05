package revise;
import java.io.*;

public class StreamsEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			String str="Adorable";
			String ss="Love is nothing";
			byte b[]=ss.getBytes();
			FileOutputStream fs=new FileOutputStream("output.txt");
			fs.write(65);
			fs.write(str.getBytes());
			fs.close();
			System.out.println("Baby, you succeed");
		} catch(Exception io){
			System.out.println("There are some errors, baby");
		}

	}

}
