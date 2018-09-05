
public class Queen extends Piece {
	public Queen(Position p)
	{
		this.pos=p;
	}
	public boolean isLegalMove(Position a)
	{
		return this.isLegalMove(pos,a);
	}
	public boolean isLegalMove(Position a,Position b)
	{
		return Rook.isLegalMove(a, b) || Bishop.isLegalMove(a, b);
	}

}
