import Elements.Figure;
import Elements.FigureCollecion;
import Elements.None;

public class Board {

    static final int boardSize = 10;

    public BoardRowCollecion getBoardRowCollecion() {
        return boardRowCollecion;
    }

    private BoardRowCollecion boardRowCollecion = new BoardRowCollecion();

    private FigureCollecion generateColorPoll(Boolean whiteFirst) {

        FigureCollecion fCBlackFirst = new FigureCollecion();
        FigureCollecion fCWhiteFirst = new FigureCollecion();

        int i = 1;
        while (i <= boardSize) {
            if (i % 2 == 0) {
                fCWhiteFirst.addFigure(new None(Figure.Color.BLACK));
                fCBlackFirst.addFigure(new None(Figure.Color.WHITE));
            }
            else {
                fCWhiteFirst.addFigure(new None(Figure.Color.WHITE));
                fCBlackFirst.addFigure(new None(Figure.Color.BLACK));
            }
            i++;
        }
        if (whiteFirst) {
            return fCWhiteFirst;
        }

        return fCBlackFirst;
    }

    void defaultArrangementOfPawnsOnBoard(int row) {

    }

    void drawBoard() {
        int i = 0;
        while (boardSize >= i) {
            if (i % 2 == 0) {
                boardRowCollecion.addBoardRow(new BoardRow(), generateColorPoll(true));
            }
            else {
                boardRowCollecion.addBoardRow(new BoardRow(), generateColorPoll(false));
            }
            i++;
        }
    }

    public Figure getFigure(int row, int col) {

        Figure search = this.getBoardRowCollecion()
                                .getBoardRow(row)
                                .getFigureCollecion()
                                .getfigure(col);

        return search;
    }

    public void setFigure(int row, int col, Figure figure) {

        this.getBoardRowCollecion()
                .getBoardRow(row-1)
                .getFigureCollecion()
                .setFigureHead(figure, col-1);

    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < boardSize; i++) {
            result += getBoardRowCollecion().getBoardRow(i).getFigureCollecion() + "\n";
        }

        return result;
    }
}
