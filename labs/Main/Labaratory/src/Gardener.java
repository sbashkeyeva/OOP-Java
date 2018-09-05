import java.util.*;

public class Gardener extends Thread {
	
	Thread thread = new Thread();
	static Random r = new Random();
	static int n = 5, m = 5;
	static boolean[][] field = new boolean[20][20];
	int x;
	int y;
	int type;
	public Gardener(int x, int y, int type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	static synchronized void paint(int x, int y, int type) {
		field[x][y] = true;
	}
	
static synchronized String getString() {
		String result = "";
		for (int i = 0; i < n; i++) {
			String row = "";
			for (int j = 0; j < m; j++) {
				if (field[i][j]) row += "1";
				else row += "0";
			}
			result += row + "\n";
		}
		return result;
	}
	
	static synchronized boolean isEmpty(int x, int y) {
		return field[x][y] == false;
	}
	
	static synchronized boolean hasEmptyCells() {
		boolean found = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (field[i][j] == false) {
					found = true;
				}
			}
		}
		return found;
	}

	public void run() {
		try {
			while (true) {				
				paint(this.x, this.y, this.type);

				String result = getString();
				result = Thread.currentThread().getName() + " kopaet:\n" + result + "\n";
				
				System.out.println(result);
				
				if (type == 0) {
					if (y + 1 >= m || !isEmpty(x, y + 1)) {
						x = x + 1;
						y = 0;
					} else {
						y = y + 1;
					}
					if (x == n) {
						System.out.println(Thread.currentThread().getName() + " finished");
						Thread.currentThread().stop();
					}
				} else {
					if (x - 1 < 0 || !isEmpty(x - 1, y)) {
						x = n - 1;
						y = y - 1;
					} else {
						x = x - 1;
					}
					if (y < 0) {
						System.out.println(Thread.currentThread().getName() + " finished");
						Thread.currentThread().stop();
					}
				}
				Thread.sleep(200, 800);
				if (!hasEmptyCells()) break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
