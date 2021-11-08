import java.awt.*;

public class Rectangle extends Shapes implements Moveable{

    //WILL BE MOVABLE

    public static int height = 70;
    public static int width = 130;
    public static int xCenter = 70;
    public static int yCenter = 90;

    public Rectangle (int height, int width) {
        Rectangle.height =height;
        Rectangle.width = width;
    }
    public static Point center(){
        int x = xCenter + width/2;
        int y = yCenter + height/2;
        return new Point(x,y);
    }
        public void drawShape (Graphics g){
            g.setColor(Color.blue);
            g.drawRect(xCenter, yCenter, Rectangle.width, Rectangle.height);
        }
    @Override
    public void fillShape(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(xCenter, yCenter, Rectangle.width, Rectangle.height);
    }
    public void drawName(Graphics g){
        g.setColor(Color.black);
        g.drawString("Rectangle", xCenter,yCenter );
    }

}
