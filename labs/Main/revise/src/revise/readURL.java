package revise;

import java.util.*;
import java.net.*;
import java.io.*;


public class readURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url=new URL("http://www.kbtu.kz/");
		BufferedReader bf=new BufferedReader(new InputStreamReader(url.openStream()));
		String inputline;
		while((inputline=bf.readLine())!=null)
		System.out.println(inputline);
		bf.close();

	}

}
