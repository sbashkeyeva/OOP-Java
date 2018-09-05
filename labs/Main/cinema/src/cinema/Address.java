package cinema;

public class Address {
	private String city, street;
	public Address (String city, String street) {
		this.city = city;
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public String toString() {
		return city + " " + street;
	}
}
