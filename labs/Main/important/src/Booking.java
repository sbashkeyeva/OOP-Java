import java.util.*;

public class Booking {
	Vector < String > historyData = new Vector <String>();
	Vector < Integer> arrivedData = new Vector <Integer>();
	public void addData(int time, String data) {
		historyData.add(data);
		arrivedData.add(time);
	}
	public void getData(int time) {
		for (int t = 0; t < arrivedData.size(); ++ t)
			if (arrivedData.elementAt(t) == time)
				System.out.println(historyData.elementAt(t));
	}
}
