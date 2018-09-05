
public class Address {
	private String city, street, house;
	public Address (String city, String street, String house) {
		this.city = city;
		this.street = street;
		this.house = house;
	}
	public String getCity() {
		return city;
	}
	public String toString() {
		return city + " " + street + " " + house;
	}
}
