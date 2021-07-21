import java.applet.*;
import java.awt.*;

/* <applet code = Main width = 500 height = 500><applet> */
public class Main extends Applet {
    public static void main(String[] args) {
    }

    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
    }

    public void paint(Graphics g) {
        g.drawString("hello world", 30, 300);
        g.drawRect(100, 100, 100, 100);
    }
}