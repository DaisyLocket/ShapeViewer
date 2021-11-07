import java.awt.*;

public class Rectangle extends Shapes{

    //WILL BE MOVABLE

    public static int height = 30;
    public static int width = 45;

    public Rectangle (int height, int width) {

    }
        public void drawShape (Graphics g){
            g.setColor(Color.blue);
            int height = this.height;
            int width = this.width;
            g.drawRect(70, 90, Rectangle.width, Rectangle.height);
        }



}
