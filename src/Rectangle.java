import java.awt.*;

/**
 * The rectangle is a subclass of Square, which extends Shape, and should implement Moveable but the moveable code is in the rectangle class
 * If I was confident enough to move it without breaking everything, I would
 *
 */

public class Rectangle extends Square implements Moveable{

    protected static int height = 70;
    protected static int width = 130;
    protected static int xRec = 70;
    protected static int yRec = 90;
    protected int bottomLeftX = xRec;
    protected int bottomLeftY = yRec + height;
    protected int topRightX = xRec + width;
    protected int topRightY = yRec;
    public BoundingBox boundingBox;

    public Rectangle (int height, int width) {
        super(height, width);
        Rectangle.height =height;
        Rectangle.width = width;

        this.boundingBox = new BoundingBox(new Point(bottomLeftX, bottomLeftY),new Point (topRightX, topRightY));
    }

    public Rectangle() {
        super();
    }

    public void drawShape (Graphics g){
        g.setColor(Color.blue);

        if(filled)
            g.fillRect(xRec, yRec, Rectangle.width, Rectangle.height);
            else
            g.drawRect(xRec, yRec, Rectangle.width, Rectangle.height);
    }

    public void drawName(Graphics g){
        g.setColor(Color.black);
        g.drawString("Rectangle", xRec, yRec);
    }

    public void boundingBox(Graphics g){
        g.setColor(Color.black);
        g.drawRect(bottomLeftX, topRightY, (topRightX - bottomLeftX), (bottomLeftY - topRightY));
    }

    public void mouseClick() {
        moveShape();
    }

    public void moveShape(){

        xRec = Rectangle.xRec +10;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "bottomLeftX=" + bottomLeftX +
                ", bottomLeftY=" + bottomLeftY +
                ", topRightX=" + topRightX +
                ", topRightY=" + topRightY +
                ", boundingBox=" + boundingBox +
                '}';
    }
}
