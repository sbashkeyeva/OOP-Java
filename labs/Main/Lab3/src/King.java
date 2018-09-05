
public class King extends Piece {
	public King(Position p)
	{
		this.pos=p; //current place of King
	}
	
	public boolean isLegalMove(Position a)
	{
		return this.isLegalMove(pos,a);
		
	}
	
	public boolean isLegalMove(Position a,Position b)
	{
		return Math.abs(a.num-b.num)<=1 && Math.abs(a.letter-b.letter)<=1;
	}
	
}
