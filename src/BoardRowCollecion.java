import Elements.FigureCollecion;

public class BoardRowCollecion {

   private BoardRow boardRowHead;

    void addBoardRow(BoardRow boardRow, FigureCollecion bR) {
        BoardRow temp;
        if (boardRowHead == null) {
            boardRowHead = boardRow;
        }
        else {
            temp = boardRowHead;
            boardRowHead = boardRow;
            temp.setColdown(boardRowHead);
            boardRowHead.setColup(temp);
            boardRowHead.setFigureCollecion(bR);
        }
    }

    BoardRow getBoardRow (int row){

        BoardRow boardRow = boardRowHead;
        if (row >= size()) {
            throw new IndexOutOfBoundsException("Choise from 0 to " + (size() - 1));
        }
        int number = 0;
        if (row > 0) {
            while (boardRow.getColup() != null) {
                boardRow = boardRow.getColup();
                number++;
                if (number == row) {
                    return boardRow;
                }
            }
        }
        else
            return boardRow;
        return null;
    }

    private int size() {

        BoardRow boardRow = boardRowHead;
        if (boardRow != null) {
            int result = 1;
            while (boardRow.getColup() != null) {
                boardRow = boardRow.getColup();
                result++;
            }
            return result;
        }
        return 0;
    }
}
