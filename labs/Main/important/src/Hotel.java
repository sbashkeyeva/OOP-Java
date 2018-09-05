import java.io.*;
import java.util.*;

public class Hotel implements Serializable {
	private int numberOfRooms;
	private Address address;
	private String name;
	private Vector <Room> rooms;
	public Hotel(String name, int numberOfRooms, Address address) {
		this.numberOfRooms = numberOfRooms;
		this.address = address;
		this.name = name;
		rooms = new Vector<Room>();
	}
	public String getCity() {
		return address.getCity();
	}
	public String toString() {
		return name + " " + address;
	}
	void addRoom(Room r) {
		rooms.add(r);
		System.out.println("Room added in Hotel " + name + "!");
	}
	public boolean canSettle(String type, int time, int curTime) {
		for (Room room : rooms) {
			if(room.getType().equals(type) && room.canSettle(curTime)) {
				System.out.println("You have settled in room" + room);
				room.changeTime(time + curTime);
				return true;
			}
		}
		System.out.println("Sooory we don't have rooms");
		return false;
	}
	public static void save (Map <String, Hotel> hotels) throws IOException {
		try {
			FileOutputStream fos2 = new FileOutputStream("hotels.out");
			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			oos2.writeObject(hotels);
			fos2.close();
			oos2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error In Save Hotels");
		}
	}
	public static Map < String, Hotel> getHotels() throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis2 = new FileInputStream("hotels.out");
			ObjectInputStream oin2 = new ObjectInputStream(fis2);
			Map<String, Hotel> hotels = (HashMap<String, Hotel>) oin2.readObject();
			oin2.close();
			fis2.close();
			return hotels;
		} catch (FileNotFoundException e) {
			System.out.println("Error In get Hotels");
			return new HashMap <String, Hotel>();
		}
		
	}

}
