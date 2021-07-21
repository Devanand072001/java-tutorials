package openNewWindow;

import javax.swing.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow() {
        label.setBounds(50, 50, 150, 100);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        System.out.println("new window created ");
        frame.setVisible(true);
    }
}
