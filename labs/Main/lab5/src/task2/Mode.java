package task2;

import java.io.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Mode {
 
 private static String getTime () {
  return new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(Calendar.getInstance().getTime());
 }
 
 public static void addData (String Data) {
  try {
   PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("admin.txt", true)));
   out.println(getTime() + " " + Data);
   out.close();
  }
  catch (IOException IO) {
   System.out.println ("Error");
  }
 }
 public static void saveCourses (Map <String, Course> courses) throws IOException {
  try {
   FileOutputStream fos2 = new FileOutputStream("courses.out");
   ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
   oos2.writeObject(courses);
   fos2.close();
   oos2.close();
  } catch (FileNotFoundException e) {
   System.out.println("Error 1");
  }
 }
 public static Map <String, Course> getCourses() throws IOException, ClassNotFoundException {
  try {
   FileInputStream fis2 = new FileInputStream("courses.out");
   ObjectInputStream oin2 = new ObjectInputStream(fis2);
   Map <String, Course> courses = (HashMap <String, Course>) oin2.readObject();
   oin2.close();
   fis2.close();
   return courses;
  } catch (FileNotFoundException e) {
   System.out.println("Error 2");
   return new HashMap <String, Course>();
  }
  
 }
}