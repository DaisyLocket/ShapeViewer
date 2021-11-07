import java.awt.*;

public class Rectangle extends Shapes{

    //WILL BE MOVABLE

    public static int height = 70;
    public static int width = 130;

    public Rectangle (int height, int width) {
        Rectangle.height =height;
        Rectangle.width = width;
    }
        public void drawShape (Graphics g){
            g.setColor(Color.blue);
            g.drawRect(70, 90, Rectangle.width, Rectangle.height);
        }
    public void drawName(Graphics g){
        g.drawString("Rectangle",70,90 );
    }



}
