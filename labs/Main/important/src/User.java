import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class User {
	String name;
	int incNumber;
	public User (String name, int incNumber) {
		this.name = name;
		this.incNumber = incNumber;
	}
	public static void save (Map <Integer, User> Users) throws IOException {
		try {
			FileOutputStream fos2 = new FileOutputStream("Users.out");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(Users);
			fos2.close();
			oos2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error In Save Users");
		}
	}
	public static Map < Integer, User> getUsers() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis2 = new FileInputStream("Users.out");
			ObjectInputStream oin2 = new ObjectInputStream(fis2);
			Map<Integer, User> Users = (HashMap<Integer, User>) oin2.readObject();
			oin2.close();
			fis2.close();
			return Users;
		} catch (FileNotFoundException e) {
			System.out.println("Error In get Users");
			return new HashMap <Integer, User>();
		}
		
	}
}
