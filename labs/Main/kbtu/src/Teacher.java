import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 */
public class Teacher extends User{
    public static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
    Position position;

    Teacher(String l, String p, String fN, Position pos){
        super(l,p,fN);
        position = pos;
    }
    //get,set,hashcode, compareTo, constructor
    static void sendOrder(Executor r)throws IOException{
        System.out.println("Order's Title: ");
        String title =  console.readLine();
        Order order=new Order(title);
        r.getOrder(order);
    }

}

