package Elements;

public class Pawn extends Figure {
    public Pawn(Color figureColor) {
        super(figureColor);
    }

    @Override
    public String toString() {
        return Character.toString((char) +0);
    }
}