import Elements.Figure;
import Elements.Queen;


public class Application {

    public static void main(String[] args) {

        Board board = new Board();
        board.drawBoard();
        board.setFigure(9, 9, new Queen(Figure.Color.BLACK));
        System.out.println(board.toString());

    }
}






