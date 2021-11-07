import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    boolean setDisplayName = true;
    private Circle c;
    private Rectangle r;
    private Square sq;
    private Quadrilateral q;

    ArrayList<Shapes> shapesList;
    //going through the list, for each shape in Shapes invoke its drawShape method
    //if setDisplayName id true invoke drawName method

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapesList = new ArrayList<>();
        shapesList.add(c);
        shapesList.add(r);
        shapesList.add(sq);
        //shapesList.add(q);

        for(Shapes shape : shapesList){
            shape.drawShape(g);
            if (setDisplayName = true){
                shape.fillShape(g);
            }
        }

        c = new Circle(Color.red, 100, 100, 100);
        Circle c = this.c;
        c.drawShape(g);

        r = new Rectangle(Rectangle.height, Rectangle.width);
        Rectangle r = this.r;
        r.drawShape(g);

        sq=new Square(Square.wh, Square.wh);
        Square sq = this.sq;
        sq.drawShape(g);

        }
    }
