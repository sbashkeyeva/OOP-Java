import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Room implements Serializable {
	private String type;
	private int costPerDay;
	private int lastPersonWillArive;
	private int numberOfRoom;
	public Room(String type, int costPerDay, int number) {
		this.type = type;
		this.costPerDay = costPerDay;
		lastPersonWillArive = 0;
		numberOfRoom = number;
	}
	public String toString() {
		return numberOfRoom + "";
	}
	public String getType() {
		return type;
	}
	public int getCost() {
		return costPerDay;
	}
	public void changeTime(int time) {
		lastPersonWillArive = time;
	}
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass())
			return false;
		Room r = (Room) o;
		if (this.type.equals(r.type))
			return true;
		return false;
	}
	public boolean canSettle(int curTime) {
		if (curTime >= lastPersonWillArive)
			return true;
		return false;
	}
}
