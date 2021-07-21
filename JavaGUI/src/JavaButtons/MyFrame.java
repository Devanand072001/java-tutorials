package JavaButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton();
    JLabel label = new JLabel();
    MyFrame(){
        ImageIcon icon = new ImageIcon("icon.png");
        button.setText("sample button");
        button.setBounds(100,100,200,70);
        button.setFocusable(false); // do not display border around the button text
        button.addActionListener(this);
        button.setIcon(icon);
        button.setIconTextGap(5);

        /*button.setSize(200,50);*/

        label.setText("button enabled");
        label.setVisible(true);
        label.setLayout(new BorderLayout(20,20));
        label.setBounds(100,200,200,100);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(420,420);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("button clicked");
            label.setText("clicked and disabled ");
            button.setEnabled(false);
            label.setForeground(Color.blue);
            label.setBackground(Color.red);
        }
    }
}
