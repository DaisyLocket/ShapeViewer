import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesManager extends JPanel { //i think this is the custom panel -THIS STORES ALL THE SHAPES
    private ArrayList<Shapes> shapesList = new ArrayList<>();
    private Circle c;
    private Rectangle r;
    //going through the list, for each shape in Shapes invoke its drawShape method

    //if setDisplayName id true invoke drawName method
    //public boolean setDisplayName;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        c = new Circle(Color.red, 100, 100, 100);
        Circle c = this.c;
        c.drawShape(g);
        c.drawName(g);

        r = new Rectangle(70, 100);
        Rectangle r = this.r;
        r.drawShape(g);
        r.drawName(g);

    }

}

    


