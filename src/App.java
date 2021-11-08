import javax.swing.*;

public class App {
    public static void main(String[] args) {

        CustomWindow customWindow = new CustomWindow();
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shape Viewer");
        customWindow.setVisible(true);


    }
}
