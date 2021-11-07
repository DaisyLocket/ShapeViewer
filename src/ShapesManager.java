import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesManager extends JPanel { //i think this is the custom panel -THIS STORES ALL THE SHAPES
    private ArrayList<Shapes> shapesList = new ArrayList<>();
    private Circle c;
    //going through the list, for each shape in Shapes invoke its drawShape method

    //if setDisplayName id true invoke drawName method

    //public boolean setDisplayName;


    public void addShape(Graphics g) {
        c = new Circle(Color.red,100,100,50);
        Circle c = this.c;
        c.drawShape(g);
    }
}

    


