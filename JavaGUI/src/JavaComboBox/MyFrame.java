package JavaComboBox;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420,420);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100,30));

        String[] cars = {"Audi", "Ford ", "Mercedes", "Nissan"};
        JComboBox<String> comboBox = new JComboBox<>(cars);
        comboBox.addActionListener(e -> {
            System.out.println(comboBox.getSelectedItem());
            textField.setText((String) comboBox.getSelectedItem());
        });
        

        this.add(comboBox);
        this.add(textField);
        this.setVisible(true);
    }
}
