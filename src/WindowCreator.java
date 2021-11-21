import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapesManager = new ShapesManager();
        /*shapesManager.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });*/
        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shape Viewer");
        customWindow.setVisible(true);

    }
}
