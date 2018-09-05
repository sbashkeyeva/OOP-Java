
public class TesterChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board=new Board();
		King king =new King(new Position('H',5));
		Bishop bishop=new Bishop(new Position('E',4));
		Knight knight=new Knight(new Position('B',8));
		Rook rook=new Rook(new Position('A',1));
		Queen queen=new Queen(new Position('F',7));
		board.addFig(king);
		board.addFig(bishop);
		board.addFig(rook);
		board.addFig(queen);
		board.addFig(knight);
		board.move("E4-E5");
	
		System.out.println(king.isLegalMove(new Position('G',6)));
		System.out.println(bishop.isLegalMove(new Position('D',5)));
		System.out.println(knight.isLegalMove(new Position('C',6)));
		System.out.println(rook.isLegalMove(new Position('A',5)));
		System.out.println(queen.isLegalMove(new Position('B',3)));

	}

}
