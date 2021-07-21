package LoginSystem;

import javax.swing.*;
import java.awt.*;


public class MyLoginWindow extends JFrame {
    MyLoginWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Login System");

        JLabel nameLabel = new JLabel("Name:", JLabel.CENTER);
        JLabel passLabel = new JLabel("Password:", JLabel.CENTER);
        nameLabel.setBounds(100, 100, 100, 100);
        passLabel.setBounds(100, 100, 100, 100);

        JTextField nameField = new JTextField(30);
        JPasswordField passField = new JPasswordField(30);

        JButton submit = new JButton("Submit");
        submit.setFocusable(false);
        JButton cancel = new JButton("Cancel");
        cancel.setFocusable(false);
        cancel.addActionListener(e -> {
            System.out.println("Cancelled");
        });
        submit.addActionListener(e -> {
            System.out.println("Name: " + nameField.getText());
            System.out.println("Password: " + passField.getText());
            System.out.println("submitted");
        });


        this.add(nameLabel);
        this.add(nameField);
        this.add(passLabel);
        this.add(passField);
        this.add(submit);
        this.add(cancel);
        this.setSize(350, 400);
        this.setVisible(true);
    }
}
