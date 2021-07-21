package JavaFrames.method1;

import javax.swing.*;
import java.awt.*;

public class JavaFrame {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("fibvo-logo.png");

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setTitle("JFrame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(240, 204, 96));
    }
}
