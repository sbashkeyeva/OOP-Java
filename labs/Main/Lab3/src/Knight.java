
public class Knight extends Piece{
	public Knight(Position p)
	{
		this.pos=p;
	}
	public boolean isLegalMove(Position a)
	{
		return this.isLegalMove(pos,a);
	}
	public boolean isLegalMove(Position a,Position b)
	{
		if(b.num>8 || b.num<0 || b.letter<'A' || b.letter>'H')
		{
			return false;
		}
		return (Math.abs(a.num-b.num)==1 && Math.abs(a.letter-b.letter)==2) || (Math.abs(a.num-b.num)==2 && Math.abs(a.letter-b.letter)==1);
	}


}
