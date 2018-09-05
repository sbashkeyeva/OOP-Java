
public class Rook extends Piece {
	public Rook(Position p)
	{
		this.pos=p;
	}
	public boolean isLegalMove(Position a)
	{
		return this.isLegalMove(pos,a);
	}
	
	public static boolean isLegalMove(Position a, Position b)
	{
		return a.num==b.num || a.letter==b.letter;
	}

}
