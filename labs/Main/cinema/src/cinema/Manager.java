package cinema;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.Vector;

public class Manager extends User implements Serializable {
	public Manager(String name, int number) {
		super(name, number);
	}
	private Map < Integer, User > users;
	private Map < String, Cinema> cinema;
	public void save() throws IOException {
		User.save(users);
		Cinema.save(cinema);
	}
	public void des() throws ClassNotFoundException, IOException {
		cinema = Cinema.getCinema();
		users = User.getUsers();
	}
	public Vector <Cinema> getHotels(String city) {
		Vector < Cinema> h = new Vector<Cinema>();
		for (Map.Entry<String, Cinema> iter : cinema.entrySet()) {
			Cinema cinema = iter.getValue();
			if (cinema.getCity().equals (city)) {
				h.add(cinema);
			}
		}
		return h;
	}
	public void addCinema(String name, int numberOfRooms, String City, String Street, String house) {
		Cinema h = new Cinema(name, new Address(City, Street));
		cinema.put(h.toString(), h);
	}
	public void addUser(String name) {
		User u = new User(name, users.size() + 1);
		users.put(u.password, u);
	}

}
