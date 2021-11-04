import javax.swing.*;
import java.awt.*;

//defines the parameters of the content of the shape viewer
public class CustomPanel extends JPanel {
    Rectangle rectangle =new Rectangle();

    @Override
    protected void paintComponent(Graphics g) {
        //The superclass does some important work in the method we've overridden, so we
        //should invoke it.
        super.paintComponent(g);



        g.setColor(Color.blue);
        //Here's an example of a shape.
        //For our panels, the origin (0,0) is the top left corner
        //This means that the +ve Y axis is "down", i.e. it's the opposite
        //of the familiar cartesian coordinate system.
        g.drawRect(5,20, 40,60);

        g.setColor(Color.pink);
        g.drawRect(150,200, 25, 50);

        g.setColor(Color.green);
        g.drawRect(50, 90, 30, 30);

        //Exercises:
        //1: Draw an oval that fits exactly within the rectangle above
        //2: Draw an oval that fills the entire panel. NOTE: the panel class has getters for its width and height.
        //3: Draw a circle of radius 25 that is centered in the center of the panel. Make the window bigger/smaller and
        //      verify that it remains centered.
        //4: See if you can find (using intellisense) the method required to draw a filled version of the circle from
        //      exercise 3.
        g.setColor(Color.red);

       int circleRadius = 25;
       g.drawOval(this.getWidth()/2 - circleRadius,
                this.getHeight()/2 - circleRadius,
                circleRadius * 2,
                circleRadius*2);


    }

}
