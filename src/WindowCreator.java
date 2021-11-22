import javax.swing.*;

/**
 * @author Sabrina Flynn
 * This is the main class, where the window is created and displayed
 *
 */

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shape Viewer");
        customWindow.setVisible(true);

    }
}
