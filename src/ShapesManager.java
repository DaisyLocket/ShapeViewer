import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapesManager extends JPanel { //i think this is the custom panel -THIS STORES ALL THE SHAPES
    private ArrayList<Shapes> shapes = new ArrayList<>();
    //going through the list, for each shape in Shapes involke its drawshape method

    //if setDisplayName id true involke drawname method

    public boolean setDisplayName;
    Circle circle = new Circle();

    public void setDisplayName(boolean b) {
    }

    public void addShape(Graphics g) {
        Circle circle = this.circle;
        circle.drawShape(g);
    }

    public void drawShapes(Graphics g) {


        //add shapes

        //create jframe/window at the bottom pass to our manager
        //create panel(mgr)
        //
    }
}

    


