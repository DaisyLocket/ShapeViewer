import java.awt.*;

public class Square extends Shape {

    protected static int wh = 60;
    protected static int height = wh;
    protected static int width = wh;
    protected static int x = 100;
    protected static int y = 190;

    public Square (int height, int width) {
       Square.height = height;
       Square.width = width;
    }

    public Square() {
    }

    public void drawShape (Graphics g){
        g.setColor(Color.orange);
        g.drawRect(x, y, Square.width, Square.height);
    }
    public void fillShape(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(x, y, Square.width, Square.height);
    }
    public void drawName(Graphics g){
        g.setColor(Color.black);
        g.drawString("Square",x,y );
    }

    @Override
    public void boundingBox() {

    }
}
