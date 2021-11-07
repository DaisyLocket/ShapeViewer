import java.awt.*;

public class Square extends Shapes{

    public static int wh = 60;
    public static int height = wh;
    public static int width = wh;


    public Square (int height, int width) {
        Square.height =height;
        Square.width = width;
    }
    public void drawShape (Graphics g){
        g.setColor(Color.green);
        g.drawRect(100, 190, Square.width, Square.height);
    }
    public void drawName(Graphics g){
        g.drawString("Square",100,190 );
    }
}
