import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Java Swing");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        frame.getContentPane().add(lblText);
        frame.pack();
        frame.setVisible(true);
    }
}