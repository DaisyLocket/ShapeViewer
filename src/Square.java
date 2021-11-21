import java.awt.*;
import java.awt.event.MouseEvent;

public class Square extends Shape {

    protected static int wh = 60;
    protected static int height = wh;
    protected static int width = wh;
    protected static int x = 100;
    protected static int y = 290;
    protected int bottomLeftX = x;
    protected int bottomLeftY = y + height;
    protected int topRightX = x + width;
    protected int topRightY = y;
    public BoundingBox boundingBox;

    public Square (int height, int width) {
       Square.height = height;
       Square.width = width;

        this.boundingBox = new BoundingBox(new Point(bottomLeftX, bottomLeftY),new Point (topRightX, topRightY));
    }

    @Override
    public void drawShape (Graphics g){
        g.setColor(Color.orange);
        if(filled)
            g.fillRect(x, y, Square.width, Square.height);
        else
            g.drawRect(x, y, Square.width, Square.height);
    }

    @Override
    public void drawName(Graphics g){
        g.setColor(Color.black);
        g.drawString("Square",x,y );
    }

    public void boundingBox(Graphics g) {

        g.setColor(Color.black);
        g.drawRect(bottomLeftX, topRightY, (topRightX - bottomLeftX), (bottomLeftY - topRightY));
    }

    /*@Override
    public void mouseClick(MouseEvent e) {

    }*/

    @Override
    public String toString() {
        return "Square{}";
    }

}
