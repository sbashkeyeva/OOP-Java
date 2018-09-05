
public class Board {
	Piece board[][];
	public Board()
	{
		
	}
	public void addFig(Piece p)
	{
		int x=p.pos.letter-65;
		int y=p.pos.num;
		board[x][y]=null;
		board[x][y]=p;
	}
	public boolean move(String cord)
	{
		int num1=cord.charAt(1)-48;
		char letter1=cord.charAt(0);
		int num2=cord.charAt(4)-48;
		char letter2=cord.charAt(3);
		Piece cur;
		cur=board[letter1][num1];
		if(cur==null) return false;
		if(cur.isLegalMove(new Position(letter1,num1),new Position(letter2,num2))){
			board[letter2][num2]=cur;
			board[letter1][num1]=null;
			return true;
		}
		return false;
	}

}
