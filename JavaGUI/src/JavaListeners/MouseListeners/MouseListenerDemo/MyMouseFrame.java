package JavaListeners.MouseListeners.MouseListenerDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseFrame extends JFrame implements MouseListener {
    JLabel label;
    JButton button;

    MyMouseFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(new Dimension(500, 400));
        this.getContentPane().setBackground(Color.lightGray);

        label = new JLabel("mouse listener");
        label.setBounds(100, 100, 100, 50);
        label.setSize(new Dimension(100, 50));
        label.setOpaque(true);
        label.setBackground(Color.orange);
        label.addMouseListener(this);
        button = new JButton("Button");
        button.setBounds(100, 200, 100, 30);
        button.addMouseListener(this);
        button.setFocusable(false);

        this.add(label);
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e.getYOnScreen());
        if (e.getSource() == label) {
            label.setText("Mouse incoming");
            label.setBackground(Color.red);
        }

        if (e.getSource() == button) {
            button.setBackground(Color.yellow);
            button.setForeground(Color.white);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == label) {
            label.setText("Mouse outgoing");
            label.setBackground(Color.orange);
        }

        if (e.getSource() == button) {
            button.setBackground(Color.blue);
            button.setForeground(Color.black);
        }
    }
}
