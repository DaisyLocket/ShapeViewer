import javax.swing.*;
import java.awt.*;

//creates the parameters for the display window
public class CustomWindow extends JFrame {

    private Graphics g;
    private ShapesManager mainPanel;
    private Circle circle;

    public CustomWindow()
    {
        mainPanel = new ShapesManager();

        //add our new panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        //set the dimensions of the frame/window
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }

}
