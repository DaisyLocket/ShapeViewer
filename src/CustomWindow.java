import javax.swing.*;
import java.awt.*;

//creates the panel to display the shapes in the window
public class CustomWindow extends JFrame {

    private ShapesManager mainPanel;

    public CustomWindow()
    {
        mainPanel = new ShapesManager();
        //add our new panel to the frame
        add(mainPanel, BorderLayout.CENTER);

        //set the dimensions of the frame/window
        setSize(Consts.FRAME_WIDTH, Consts.FRAME_HEIGHT);
    }

}
