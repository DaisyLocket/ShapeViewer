import javax.swing.*;
import java.awt.*;

//defines the parameters of the content of the shape viewer
public abstract class Shapes extends JPanel {
    Color color;
    boolean filled;
    int xCenter, yCenter;

    public abstract void drawShape(Graphics g);

    public abstract void fillShape(Graphics g);

    public abstract void drawName(Graphics g);


}
