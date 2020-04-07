public class Queen extends Figure {
    public Queen(Figure.Color figureColor) {
        super(figureColor);
    }

    @Override
    public String toString() {
        return Character.toString((char)+177);
    }

    /*
    public static final Queen INSTANCE = new Queen();

    private Queen() {
        super();
        if (INSTANCE != null) {
            throw new IllegalMonitorStateException("Figura juz uzyta w kolekcji");
        }


   }

}
 */
}