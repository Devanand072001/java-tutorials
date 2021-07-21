package JavaTextField;

import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;


public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,30));
        textField.setFont(new Font("Fira Code",Font.PLAIN,15));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        /*textField.setBounds(100,100,250,250);*/
        JLabel label = new JLabel();
        label.setBounds(100,100,250,250);
        label.setText("hello user");

        JButton submitBtn = new JButton("Submit");
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(e -> {
            label.setText(MessageFormat.format("welcome {0}", textField.getText()));
        });


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(textField);
        this.add(submitBtn);


        this.setSize(450,450);
        /*this.pack();*///adjust size automatically to the components
        this.setVisible(true);
    }
}
