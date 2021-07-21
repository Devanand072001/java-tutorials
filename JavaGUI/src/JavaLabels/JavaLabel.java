package JavaLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static javax.swing.BorderFactory.*;

public class JavaLabel {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("logo.png");

        Border border = createLineBorder(Color.gray,5,true);

        JLabel label = new JLabel();
        label.setText("label text");
        /*label.setBounds(100,100,100,100);*/
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x08282b));
        label.setFont(new Font("Roboto",Font.PLAIN,25));
        label.setIconTextGap(100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50,50,350,350);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.add(label);
        frame.setLayout(null);

    }
}
