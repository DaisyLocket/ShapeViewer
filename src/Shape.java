import java.awt.*;
import java.awt.event.MouseEvent;

//defines the parameters of the content of the shape viewer
//abstract class Shapes
public abstract class Shape {
    protected Color color;
    protected static boolean filled;
    protected int xCenter, yCenter;

    Shape() {
        this(0, 0);
    }

    Shape(int xCenter, int yCenter) {
        this(Color.black, xCenter, yCenter);
    }

    Shape(Color color, int xCenter, int yCenter) {
        this(color, xCenter, yCenter, false);
    }

    Shape(Color color, int xCenter, int yCenter, boolean filled) {
        this.color = color;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.filled = filled;
    }

    public abstract void drawShape(Graphics g);


    public abstract void drawName(Graphics g);


    public abstract void boundingBox(Graphics g);
/*
    public abstract void mouseClick(MouseEvent e);
}*/
}