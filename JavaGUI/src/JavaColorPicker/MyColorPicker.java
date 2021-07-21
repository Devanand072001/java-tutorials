package JavaColorPicker;

import javax.swing.*;
import java.awt.*;

public class MyColorPicker extends JFrame {
    MyColorPicker(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());


        JButton button = new JButton("Choose a color");
            JLabel label = new JLabel("Color Picker");
            label.setOpaque(true);
            label.setFont(new Font("MV Boli", Font.PLAIN, 50));
            label.setBackground(Color.white);
        button.setFocusable(false);
        button.addActionListener(e -> {
            JColorChooser colorChooser = new JColorChooser();
            System.out.println(colorChooser.getColor());
            Color color = JColorChooser.showDialog(null,"Pick a color",Color.white);
            label.setForeground(color);
        });


        this.add(label);
        this.add(button);
        this.setVisible(true);
    }
}
