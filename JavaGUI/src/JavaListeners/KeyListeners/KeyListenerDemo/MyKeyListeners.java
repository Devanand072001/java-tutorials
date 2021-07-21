package JavaListeners.KeyListeners.KeyListenerDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListeners extends JFrame implements KeyListener {
    JLabel label;

    MyKeyListeners() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);

        this.setSize(420, 420);
        this.addKeyListener(this);

        label = new JLabel("Key Listeners");
        label.setBounds(0, 0, 50, 50);
        label.setBackground(Color.orange);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a physical key is typed. Uses keyChar, char output
        switch (e.getKeyChar()) {
            case 'a' :
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            case 'd' :
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 's' :
                label.setLocation(label.getX(), label.getY() + 20);
                break;
            default :
                System.out.println("Unexpected value: " + e.getKeyChar());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down, Uses keyCode, int output.
        switch (e.getKeyCode()) {
            case 37 :
                label.setLocation(label.getX() - 20, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 20);
                break;
            case 39 :
                label.setLocation(label.getX() + 20, label.getY());
                break;
            case 40 :
                label.setLocation(label.getX(), label.getY() + 20);
                break;
            default :
                System.out.println("Unexpected value: " + e.getKeyCode());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        /*
called whenever the key is released
        System.out.println("you released the key char: " + e.getKeyChar());
        System.out.println("you released the key code: " + e.getKeyCode());
*/

    }
}
