import java.awt.*;
import java.awt.event.MouseEvent;

public class Circle extends Shape {
    private static int radius = 40;
    protected static int width = radius * 2;
    protected static int height = radius * 2;
    protected int x = 350;
    protected int y = 250;

    protected int bottomLeftX = x;
    protected int bottomLeftY = y + (radius * 2);
    protected int topRightX = x + (radius * 2);
    protected int topRightY = y;
    public BoundingBox boundingBox;

    public Circle (Color color, int width, int height){
        this.color = color;
        this.width = radius * 2;
        this.height = radius * 2;

        this.boundingBox = new BoundingBox(new Point(bottomLeftX, bottomLeftY),new Point (topRightX, topRightY));

    }
    public void drawShape(Graphics g) {
        g.setColor(Color.red);

        if(filled)
            g.fillOval(x,y,radius * 2,radius * 2);
        else
            g.drawOval(x, y,radius * 2,radius * 2);
    }


    public void drawName(Graphics g){
        g.setColor(Color.black);
        g.drawString("Circle",x,y );
    }

    @Override
    public void boundingBox(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(bottomLeftX, topRightY, (topRightX - bottomLeftX), (bottomLeftY - topRightY));
    }

    /*@Override
    public void mouseClick(MouseEvent e) {

    }*/

}
