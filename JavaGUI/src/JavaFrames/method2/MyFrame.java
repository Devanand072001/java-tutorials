package JavaFrames.method2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        ImageIcon image = new ImageIcon("fibvo-logo.png");

    /*    JFrame frame = new JFrame();*/
        this.setVisible(true);
        this.setSize(420,420);
        this.setTitle("JFrame title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(240, 204, 96));
    }
}
