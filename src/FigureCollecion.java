public class FigureCollecion {

    protected Figure figureHead;

    public void setFigureHead(Figure newFigure, int index) {

        Figure.Color colorCopy = getfigure(index).getColor();
        if (index == size() - 1) {

            getfigure(index).getPrev().setNext(newFigure);
            newFigure.setColor(colorCopy);
        }

        if (index == 0) {

            Figure t = getfigure(index);
            figureHead = newFigure;
            newFigure.setNext(t.getNext());
            newFigure.setColor(colorCopy);
        }

        if ((index != (size() - 1)) && (index != 0)) {

            Figure t = getfigure(index);
            getfigure(index).getPrev().setNext(newFigure);
            newFigure.setPrev(t.getPrev());
            newFigure.setNext(t.getNext());
            newFigure.setColor(colorCopy);
        }

    }

    void addFigure(Figure add) {

        Figure temp;
        if (figureHead == null) {
            figureHead = add;
        }
        else {
            temp = figureHead;
            figureHead = add;
            temp.setPrev(figureHead);
            figureHead.setNext(temp);
        }
    }

    public Boolean checkUnique() {

        int a = size();
        Boolean test = true;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i != j && getfigure(i).hashCode() == getfigure(j).hashCode()) {
                    System.out.println(i + " " + j + " " + getfigure(i) + "" + getfigure(j));
                    test = false;
                }
            }
        }
        return test;
    }

    private Boolean checkUnique(Figure add) {
        int a = size();

        Boolean test = true;
        for (int i = 0; i < a; i++) {
            if (getfigure(i).hashCode() == add.hashCode()) {
                System.out.println(i + " " + " " + getfigure(i) + "" + add);
                test = false;

            }
        }
        return test;
    }

    int size() {

        Figure figure = figureHead;

        if (figure != null) {
            int result = 1;
            while (figure.getNext() != null) {
                figure = figure.getNext();
                result++;
            }
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {

        String result = "";
        int a = size();
        for (int i = 0; i < a; i++) {
            result += " " + getfigure(i).toString() + " ";

        }
        return result;
    }

    Figure getfigure(int index) {

        Figure figure = figureHead;
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Choise from 0 to " + (size() - 1));
        }
        int number = 0;
        if (index > 0) {
            while (figure.getNext() != null) {
                figure = figure.getNext();
                number++;
                if (number == index) {
                    return figure;
                }
            }
        }
        else
            return figure;
        return null;
    }


}









