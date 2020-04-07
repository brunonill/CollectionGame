import java.util.Objects;

public class Figure {
    public Figure() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return color == figure.color &&
               Objects.equals(type, figure.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color,type);
    }

    public Figure(Color figureColor) {

        this.color = figureColor;

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    Color color;
    Figure next;
    Figure prev;
    String type = this.getClass().getSimpleName();



    public Figure getNext() {
        return next;
    }

    public void setNext(Figure next) {
        this.next = next;
    }

    public Figure getPrev() {
        return prev;
    }

    public void setPrev(Figure prev) {
        this.prev = prev;
    }

    enum Color {
        BLACK, WHITE

    }
}