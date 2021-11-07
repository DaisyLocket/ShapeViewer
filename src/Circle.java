import java.awt.*;

public class Circle extends Shapes{
    private int radius = 30;

    public Circle (Color color, int xCentre, int yCentre, int radius){
    }
    public void drawShape(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(250,250,radius * 2,radius * 2);
    }

    @Override
    public void fillShape(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(250,250,radius * 2,radius * 2);

    }

    public void drawName(Graphics g){
        g.drawString("Circle",250,250 );
    }

}
