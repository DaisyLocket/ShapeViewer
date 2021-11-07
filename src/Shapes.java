import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//defines the parameters of the content of the shape viewer
public abstract class Shapes extends JPanel {
    Color color;
    static boolean filled;
    int xCenter, yCenter;
    private Shapes Circle;
    private Shapes Rectangle;
    private Shapes Square;

    public abstract void drawShape(Graphics g);

    public abstract void fillShape(Graphics g);

    public abstract void drawName(Graphics g);

    public ArrayList<Shapes> shapesList;
    public void setShapesList(ArrayList<Shapes> shapesList) {
        this.shapesList = shapesList;
        shapesList.add(Circle);
        shapesList.add(Rectangle);
        shapesList.add(Square);
    }
        /*
    @Override
    //protected void paintComponent(Graphics g) {
        //The superclass does some important work in the method we've overridden, so we
        //should invoke it.
       // super.paintComponent(g);

        g.setColor(Color.blue);
        //Here's an example of a shape.
        //For our panels, the origin (0,0) is the top left corner
        //This means that the +ve Y axis is "down", i.e. it's the opposite
        //of the familiar cartesian coordinate system.
        g.drawRect(5,20, 40,60);

        g.setColor(Color.pink);
        g.drawRect(150,200, 25, 50);

        g.setColor(Color.green);
        g.drawRect(50, 90, 30, 30);

    }*/

}
