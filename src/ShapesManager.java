import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    private ArrayList<Shape> shapeList;
    private Square sq;
    private Rectangle r;
    private Circle c;
    private Quadrilateral quad;
    boolean setDisplayName = true;
    boolean filled = false;
    private Shape shape;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        c = new Circle(Color.red, 100, 100);
        r = new Rectangle(Rectangle.height, Rectangle.width);
        sq = new Square(Square.height, Square.width);
        quad = new Quadrilateral();

        shapeList = new ArrayList<>();
        shapeList.add(c);
        shapeList.add(r);
        shapeList.add(sq);
        shapeList.add(quad);

        for (Shape shape : shapeList) {
            shape.drawShape(g);
        }

        for (Shape shape : shapeList) {
            if (setDisplayName) {
                shape.drawName(g);
            }

            if (filled) {
                shape.drawName(g);
            }
        }
        System.out.println();
    }
}
