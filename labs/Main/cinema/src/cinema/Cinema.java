package cinema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Cinema {
	private Address address;
	private String name;
    public Cinema(String name, Address address) {
		this.address = address;
		this.name = name;
	}
    public String getCity() {
		return address.getCity();
	}
	public String toString() {
		return name + " " + address;
	}
	
    public static void save (Map <String, Cinema> cinema) throws IOException {
		try {
			FileOutputStream fos2 = new FileOutputStream("cinema.out");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(cinema);
			fos2.close();
			oos2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error In Save Cinema");
		}
	}
	public static Map < String, Cinema> getCinema() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis2 = new FileInputStream("cinema.out");
			ObjectInputStream oin2 = new ObjectInputStream(fis2);
			Map<String, Cinema> cinema = (HashMap<String, Cinema>) oin2.readObject();
			oin2.close();
			fis2.close();
			return cinema;
		} catch (FileNotFoundException e) {
			System.out.println("Error In get Cinemas");
			return new HashMap <String, Cinema>();
		}
		
	}

}
