package cinema;

public class ThreeD extends RoomDecorator {

	public ThreeD(Room r) {
		super(r);
	}
	public double getCost()
	{
		return super.getCost()+0.5;
	}
	public String getDescription()
	{
		return super.getDescription()+" with reclining sofas"+ " and special watches";
	}
}
