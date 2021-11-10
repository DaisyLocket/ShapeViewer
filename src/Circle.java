import java.awt.*;

public class Circle extends Shape {
    private int radius = 40;

    public Circle (Color color, int xCentre, int yCentre){
        this.color = color;
        this.xCenter = xCentre;
        this.yCenter = yCentre;

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
        g.setColor(Color.black);
        g.drawString("Circle",250,250 );
    }

}
