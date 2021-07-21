package JavaProgressBar;

import javax.swing.*;
import java.awt.*;


public class JavaProgressBar {
    JFrame frame = new JFrame("Java Progress bar");
    JProgressBar bar = new JProgressBar(JProgressBar.CENTER,0,100);
    JButton incrementBtn = new JButton("+");
    JButton decrementBtn = new JButton("-");
    int value = 0;

    public JavaProgressBar() throws InterruptedException {

        bar.setValue(value);
        bar.setBounds(15, 30, 400, 50);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setStringPainted(true);
        bar.setBackground(Color.black);
        bar.setForeground(Color.green);

        incrementBtn.setBounds(20, 100, 50, 30);
        incrementBtn.addActionListener(e -> {
            value = value + 5;
            bar.setValue(value);
        });

        decrementBtn.setBounds(300, 100, 50, 30);
        decrementBtn.addActionListener(e -> {
            value = value - 5;
            bar.setValue(value);
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setLayout(null);
        frame.add(bar);
        frame.add(incrementBtn);
        frame.add(decrementBtn);

        frame.setVisible(true);
        fill();
    }

    public void fill() throws InterruptedException {
        for ( ; value <= 100; value++) {
            if (value == 100) {
                bar.setString("Done!");
            } else {
                bar.setValue(value);
            }
            Thread.sleep(100);
        }
    }
}
