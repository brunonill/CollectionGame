public class BoardRow {


    private BoardRow colup;
    private BoardRow coldown;
    private FigureCollecion figureCollecion;



    public BoardRow() {
    }

    public BoardRow getColup() {
        return colup;
    }

    public void setColup(BoardRow colup) {
        this.colup = colup;
    }

    public BoardRow getColdown() {
        return coldown;
    }

    public void setColdown(BoardRow coldown) {
        this.coldown = coldown;
    }

    public FigureCollecion getFigureCollecion() {
        return figureCollecion;
    }

    public void setFigureCollecion(FigureCollecion figureCollecion) {
        this.figureCollecion = figureCollecion;
    }
}
