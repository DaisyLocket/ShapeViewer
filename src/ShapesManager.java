import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {
    public ArrayList<Shape> shapeList;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        c = new Circle(Color.red, 100, 100, 50);
        r = new Rectangle(r.height, r.width);
        sq = new Square(sq.height, sq.width);

        shapeList = new ArrayList<>();
        shapeList.add(c);
        shapeList.add(r);
        shapeList.add(sq);

        for (Shape shape : shapeList){
            shape.drawShape(g);
        }

        for (Shape shape : shapeList){
            if(setDisplayName) {
            shape.drawName(g);
            }
        }

        if(filled){
            c.fillShape(g);
            r.fillShape(g);
            sq.fillShape(g);
        }
        }

    private Square sq;
    private Rectangle r;
    private Circle c;
    boolean setDisplayName = true;
    boolean filled = false;
}
