package JavaCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton submitBtn;
    JCheckBox checkBox;
    public MyFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        submitBtn = new JButton("Submit");
        submitBtn.setFocusable(false);
        submitBtn.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setForeground(Color.green);
        checkBox.setFont(new Font("Fira Code",Font.PLAIN,25));

        this.add(checkBox);
        this.add(submitBtn);
        this.setSize(400,250);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            System.out.println(checkBox.isSelected());
        }
    }
}
