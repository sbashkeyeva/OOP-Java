package task1;

import java.io.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public class SecondGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Student> students=new Vector<Student>();
		try 
		{
			BufferedReader br=new BufferedReader(new FileReader("score.txt"));
			String first=br.readLine();
			while(first!=null)
			{
				String data[]=first.split(" ");
				students.add(new Student(data[0],data[1],data[2]));
				first=br.readLine();
			}
			br.close();
		} catch(IOException io)
		{
			System.out.println("can't read that");
		}
		try 
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter("grades.txt"));
			for(Student s:students)
			{
				bw.write(s.toString());
				bw.newLine();
			}
			bw.close();
	
		} catch (IOException io)
		{
			System.out.println("can't write that"); 
		}
		
		
		

	}

}
