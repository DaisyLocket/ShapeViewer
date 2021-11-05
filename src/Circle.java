import java.awt.*;

public class Circle extends Shapes{

    @Override
    public void drawShape(Graphics g) {
        super.drawShape(g);

        g.setColor(Color.red);
        int circleRadius = 30;
        g.drawOval(250,250,circleRadius * 2,circleRadius * 2);

    }
    public void drawName(Graphics g){
        g.drawString("Circle",250,250 );
    }



}
