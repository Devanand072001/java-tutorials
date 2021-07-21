package JavaPanels;

import javax.swing.*;
import java.awt.*;

public class JavaPanels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("logo.png");
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setText("label text");
        label.setForeground(Color.white);
        label.setFont(new Font("Roboto",Font.PLAIN,15));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);

        /*JPanel is a GUI component similar to container*/
        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(240, 79, 79));
        redPanel.setBounds(0,0,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0x4ff075));
        greenPanel.setBounds(250,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBounds(0,250,500,250);
        bluePanel.setBackground(new Color(78, 92, 217));
        bluePanel.setLayout(new BorderLayout());
        bluePanel.add(label);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setTitle("Java Panels");
        frame.getContentPane().setBackground(new Color(225, 247, 252));
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);


    }
}
