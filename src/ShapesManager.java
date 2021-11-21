import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    private ArrayList<Shape> shapeList;
    private Square sq;
    private Rectangle r;
    private Circle c;
    private Quadrilateral quad;
    boolean setDisplayName = true;
    boolean filled = Shape.filled;
    boolean drawBoundingBox = true;
    private Shape shape;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        c = new Circle(Color.red,Circle.width, Circle.height);
        sq = new Square(Square.height, Square.width);
        r = new Rectangle(Rectangle.height, Rectangle.width);
        quad = new Quadrilateral(Quadrilateral.xPoly, Quadrilateral.yPoly, Quadrilateral.numOfPoints);

        shapeList = new ArrayList<>();
        shapeList.add(c);
        shapeList.add(sq);
        shapeList.add(r);
        shapeList.add(quad);

        for (Shape shape : shapeList) {
            shape.drawShape(g);
        }

        for (Shape shape : shapeList) {
            if (setDisplayName) {
                shape.drawName(g);
            }
        }
        for (Shape shape : shapeList){
            if(drawBoundingBox)
            shape.boundingBox(g);
        }

    }


}
