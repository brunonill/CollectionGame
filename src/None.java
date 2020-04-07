public class None extends Figure {
    public None() {
        super();
      this.color = Color.WHITE;
    }

    public None(Color figureColor) {
        super(figureColor);
    }

    @Override
    public String toString() {

        char result;
        if (color == Color.WHITE) {
           // result = (char) +0;
            result = '|';
        } else{
                result = '_';
            }

       return Character.toString(result);
    }
    /*
    public static final None INSTANCE = new None();

    private None() {
        if (INSTANCE != null) {
            throw new IllegalMonitorStateException("Figura juz uzyta w kolekcji");
        }

    }
}
*/
}

