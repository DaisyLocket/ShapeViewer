import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {
    public ArrayList<Shapes> shapesList;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        c = new Circle(Color.red, 100, 100, 50);
        r = new Rectangle(r.height, r.width);
        sq = new Square(sq.height, sq.width);

        shapesList = new ArrayList<>();
        shapesList.add(c);
        shapesList.add(r);
        shapesList.add(sq);

        for (Shapes shapes : shapesList){
            shapes.drawShape(g);
        }

        if(setDisplayName){
            c.drawName(g);
            r.drawName(g);
            sq.drawName(g);
        }
        }

    private Square sq;
    private Rectangle r;
    public Circle c;
    boolean setDisplayName = true;
}
