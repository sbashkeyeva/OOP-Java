package task1;
import java.io.*;
import java.util.Collections;
import java.util.Vector;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector <Student> students=new Vector<Student>();
      try {
    	  BufferedReader br =new BufferedReader(new FileReader("score.txt"));
    	  String firstLine=br.readLine();
    	  while(firstLine!=null)
    	  {
    		  String data[]=firstLine.split(" ");
    		  students.add(new Student(data[0], data[1],data[2]));
    		  firstLine=br.readLine();
    	  }
    	  br.close();
      }catch (IOException io)
      {
    	  System.out.println("There is no inputs to read ");
      }
      try {
    	  BufferedWriter bw=new BufferedWriter(new FileWriter("grades.txt",true));
    	  
    	  bw.newLine();
    	  bw.write("Total Average is:"+(students.lastElement().sumOf/students.size()));
    	  bw.newLine();
    	  bw.write("The Minimum grade is:"+Collections.min(students).grade);
    	  bw.newLine();
    	  bw.write("The Maximum grade is:"+Collections.max(students).grade);
    	  bw.newLine();
    	  bw.close();
      }catch(IOException io)
      {
    	  System.out.println("There is no outputs to write");
      }
	}

}
