import javax.swing.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shape Viewer");
        customWindow.setVisible(true);

    }
}
