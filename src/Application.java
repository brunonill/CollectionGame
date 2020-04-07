
public class Application {


    private static Figure Pawn;

    public static void main(String[] args) {


        // for (int i = 0; i < 399; i++) {
        //      System.out.println((char)+i + "" + i);

        // }

         Board board = new Board();
         board.drawBoard();
       // System.out.println(board.toString());
        board.setFigure(2,2,new Queen(Figure.Color.BLACK));
        System.out.println(board.toString());

        // FigureCollecion figureCollecion = new FigureCollecion();
      //  figureCollecion.addFigure(new None());
      //  figureCollecion.addFigure(new None());
      //  figureCollecion.addFigure(new None());

        //  FigureCollecion f1 = board.generateColorPoll(false);
        //  System.out.println(f1.toString());
      //  System.out.println(figureCollecion.toString());
      //  figureCollecion.setFigureHead(new Queen(Figure.Color.BLACK), 2);
       // System.out.println(figureCollecion.toString());

        //   board.getBoardRowCollecion().getBoardRow(0).setFigureCollecion(figureCollecion);
        // System.out.println(board.toString());
        //  System.out.println(board.getFigure(3, 3));
        //  board.setFigure(3,3,new Pawn(board.getFigure(3,3).getColor()));
        //      System.out.println(board.getFigure(3, 3));

        // FigureCollecion figureCollecion = new FigureCollecion();
        // figureCollecion.addFigure(new None());
         /*
        figureCollecion.addFigure(new None(Figure.Color.BLACK));
        figureCollecion.addFigure(new None());
        figureCollecion.addFigure(new None(Figure.Color.BLACK));
        figureCollecion.addFigure(new None());
        figureCollecion.addFigure(new None(Figure.Color.BLACK));
        figureCollecion.addFigure(new None());
        figureCollecion.addFigure(new None(Figure.Color.BLACK));
        figureCollecion.addFigure(new None());
        figureCollecion.addFigure(new None(Figure.Color.BLACK));
        figureCollecion.addFigure(new None());

        System.out.println(figureCollecion.toString());





        //  figureCollecion.addFigure(new Pawn(Figure.Color.BLACK));
     //   figureCollecion.addFigure(new None());
     //   figureCollecion.addFigure(new Queen(Figure.Color.WHITE));
      //  figureCollecion.addFigure(new Queen(Figure.Color.BLACK));
//        System.out.println(figureCollecion.toString());

       // System.out.println(figureCollecion.getfigure(0));
      // System.out.println(figureCollecion.getfigure(0).getColor());
       // System.out.println(figureCollecion.getfigure(2));
      //  System.out.println(figureCollecion.getfigure(3));

     */
    }
}






