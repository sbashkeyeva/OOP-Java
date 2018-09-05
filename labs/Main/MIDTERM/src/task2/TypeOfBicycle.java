package task2;

public class TypeOfBicycle implements Bicycle {
	    int speed = 0;
	    public void speedUp(int increment) {
	         speed = speed + increment;   
	    }

	    public void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	   

}
