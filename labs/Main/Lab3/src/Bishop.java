
public class Bishop extends Piece {
	public Bishop(Position p)
	{
		this.pos=p;
	}
	public boolean isLegalMove(Position a)
	{
		return this.isLegalMove(pos , a);
	}
	public static boolean isLegalMove(Position a, Position b)
	{
		return Math.abs(a.num-b.num)==Math.abs(a.letter-b.letter);
	}

}
