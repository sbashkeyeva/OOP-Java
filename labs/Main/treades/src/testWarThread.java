public class testWarThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WarThread country1 = new WarThread("Anchuariya", 10);
		country1.setResource(5000);
		
		WarThread country2 = new WarThread("Taranteriya",13);
		country2.setResource(4000);
		
		country1.start();
		country2.start();
		
	}
}
