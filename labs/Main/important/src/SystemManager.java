import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.Vector;

public class SystemManager extends User implements Serializable {
	private Map < Integer, User > users;
	private Map < String, Hotel> hotels;
	public SystemManager(String name, int incNumber) {
		super(name, incNumber);
	}
	public void save() throws IOException {
		User.save(users);
		Hotel.save(hotels);
	}
	public void inic() throws ClassNotFoundException, IOException {
		hotels = Hotel.getHotels();
		users = User.getUsers();
	}
	public void addUser(String name) {
		User u = new User(name, users.size() + 1);
		users.put(u.incNumber, u);
	}
	public void addHotel(String name, int numberOfRooms, String City, String Street, String house) {
		Hotel h = new Hotel(name, numberOfRooms, new Address(City, Street, house));
		hotels.put(h.toString(), h);
	}
	public Vector <Hotel> getHotels(String city) {
		Vector < Hotel> h = new Vector<Hotel>();
		for (Map.Entry<String, Hotel> iter : hotels.entrySet()) {
			Hotel hotel = iter.getValue();
			if (hotel.getCity().equals (city)) {
				h.add(hotel);
			}
		}
		return h;
	}
}
