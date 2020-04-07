package Elements;

public class Queen extends Figure {
    public Queen(Figure.Color figureColor) {
        super(figureColor);
    }

    @Override
    public String toString() {
        return Character.toString((char)+177);
    }
}