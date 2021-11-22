import java.awt.*;

/**
 * Shape is an abstract super class
 */

public abstract class Shape {
    protected Color color;
    protected boolean filled;
    protected int x, y;

    Shape() {
        this(0, 0);
    }

    Shape(int x, int y) {
        this(Color.black, x, y);
    }

    Shape(Color color, int x, int y) {
        this(color, x, y, false);
    }

    Shape(Color color, int x, int y, boolean filled) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.filled = filled;
    }

    public abstract void drawShape(Graphics g);


    public abstract void drawName(Graphics g);


    public abstract void boundingBox(Graphics g);

}