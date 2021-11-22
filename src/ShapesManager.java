import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * All shapes are created in the Shape Manager
 * The display name can be set to true or false from here
 * The bounding box and also be set to show or not, using the drawBoundingBox boolean
 */
//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    protected ArrayList<Shape> shapeList = new ArrayList<>();
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

        /**
         * Each shape is drawn to the panel on the window
         * Each shape is set as shows its outline or a filled shape depending on its 'filled' status in its method
         */
        for (Shape shape : shapeList) {
            shape.drawShape(g);
        }

        /**
         * If the setDisplayName boolean is true the shape name is displayed at each shape
         */
        for (Shape shape : shapeList) {
            if (setDisplayName) {
                shape.drawName(g);
            }
        }
        /**
         * If the drawBoundingBox boolean is true then the bounding box is displayed
         */
        for (Shape shape : shapeList){
            if(drawBoundingBox)
            shape.boundingBox(g);
        }

        /**
         * When the mouse is clicked on the panel the rectangle and square shapes move 10 pixels along the x-axis
         */
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
