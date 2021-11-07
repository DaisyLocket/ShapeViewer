import javax.swing.*;
import java.awt.*;

//Stores all the shapes and calls them
public class ShapesManager extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        c = new Circle(Color.red, 100, 100, 100);
        c.drawShape(g);
        c.drawName(g);

        r = new Rectangle(r.height, r.width);
        r.drawShape(g);
        r.drawName(g);

        sq = new Square(sq.height, sq.width);
        sq.drawShape(g);
        sq.drawName(g);
        }

    private Square sq;
    private Rectangle r;
    public Circle c;
    boolean setDisplayName = true;
}
