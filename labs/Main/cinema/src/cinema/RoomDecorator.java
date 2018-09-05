package cinema;

public abstract class RoomDecorator {
	protected final Room decoratedRoom;
	public RoomDecorator(Room r)
	{
		this.decoratedRoom=r;
	}
	public double getCost()
	{
		return decoratedRoom.getCost();
	}
	public String getDescription()
	{
		return decoratedRoom.getDescription();
	}
	

}
