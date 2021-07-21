import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(450, 450));
        this.setLayout(new FlowLayout());
        this.add(btn1);
        this.add(btn2);
        btn1.setBounds(100, 100, 100, 100);
        btn2.setBounds(300, 100, 100, 100);
        btn1.addActionListener(e -> System.out.println(btn1.getText() + " clicked"));
        btn2.addActionListener(e -> System.out.println(btn2.getText() + " Clicked"));
        this.setVisible(true);
    }
}
