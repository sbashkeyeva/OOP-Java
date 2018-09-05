
public class TestTemperature {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature();
		t.setValue(0);
		t.setScale('C');
			
		System.out.println(t.DegreesInCelsius() + " C");
		System.out.println(t.DegreesInFahrenheit() + " F");
		//System.out.print(t.getScale());
		
	}

}
