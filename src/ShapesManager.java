import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    protected ArrayList<Shape> shapeList = new ArrayList<>();;
    protected Square sq;
    protected Rectangle r;
    protected Circle c;
    protected Quadrilateral quad;
    protected Quadrilateral quad2;
    boolean setDisplayName = true;
    boolean drawBoundingBox = true;
    protected Shape shape;

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        sq = new Square(Square.height, Square.width);
        r = new Rectangle(Rectangle.height, Rectangle.width);
        c  = new Circle(Color.red,Circle.width, Circle.height);
        quad = new Quadrilateral(Quadrilateral.xPoly, Quadrilateral.yPoly, Quadrilateral.numOfPoints);
        //quad2 = new Quadrilateral(300, 140, 130, 50);

        shapeList = new ArrayList<>();
        shapeList.add(c);
        shapeList.add(sq);
        shapeList.add(r);
        shapeList.add(quad);
        //shapeList.add(quad2);

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

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                r.mouseClick();
                sq.mouseClick();
                repaint();
            }
        });
    }
}
