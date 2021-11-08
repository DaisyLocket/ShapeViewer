import javax.swing.*;
import java.awt.*;

//defines the parameters of the content of the shape viewer
public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected int xCenter, yCenter;

    Shape() { this(0,0);}

    Shape(int xCenter, int yCenter) { this(Color.black, xCenter, yCenter);}
    Shape(Color color, int xCenter, int yCenter) { this(color, xCenter, yCenter, false); }
    Shape (Color color, int xCenter, int yCenter, boolean filled){
        this.color = color;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.filled = filled;
    }



    public abstract void drawShape(Graphics g);

    public abstract void fillShape(Graphics g);

    public abstract void drawName(Graphics g);


}
