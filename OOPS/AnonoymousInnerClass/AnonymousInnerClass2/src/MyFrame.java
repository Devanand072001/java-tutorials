import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    MyButton btn1 = new MyButton("Button 1");
    MyButton btn2 = new MyButton("Button 2");
    MyButton btn3 = new MyButton("Button 3");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(450, 450));
        this.setLayout(new FlowLayout());
        btn1.setBounds(100, 100, 100, 100);
        btn2.setBounds(200, 100, 100, 100);
        btn3.setBounds(300, 100, 100, 100);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(btn1.getText() + " pressed");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(btn2.getText() + " pressed");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(btn3.getText() + " pressed");
            }
        });

        btn2.addActionListener();
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);


        this.setVisible(true);
    }
}
