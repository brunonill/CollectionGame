public class Pawn extends Figure {
    public Pawn(Color figureColor) {
        super(figureColor);
    }

    @Override
    public String toString() {
        return Character.toString((char) +0);
    }

/*
    public static final Pawn INSTANCE = new Pawn();

    private Pawn() {
        if (INSTANCE != null) {
            throw new IllegalMonitorStateException("Figura juz uzyta w kolekcji");
        }

    }
}
*/
}