package cinema;

public class VIP extends RoomDecorator {

	public VIP(Room r) {
		super(r);
	}
	public double getCost()
	{
		return super.getCost()+0.5;
	}
	public String getDescription()
	{
		return super.getDescription()+" with reclining sofas";
	}
	

}
