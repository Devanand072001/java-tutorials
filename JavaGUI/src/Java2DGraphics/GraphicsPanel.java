package Java2DGraphics;

import javax.swing.*;
import java.awt.*;

//the last given design will overlap tha above
public class GraphicsPanel extends JPanel {
    GraphicsPanel() {
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(new Color(222, 222, 222));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        /*graphics2D.setPaint(Color.blue);
        graphics2D.setStroke(new BasicStroke(5));*/
        //graphics2D.drawLine(0,0,400,400);
//        graphics2D.drawRect(10 ,10,100,150);//rectangle with border
//
//        graphics2D.setPaint(Color.yellow);
//        graphics2D.fillRect(10,10,100,150);//filled rectangle
//
//        graphics2D.setPaint(Color.orange);
//        graphics2D.drawOval(200,10,100,100);
//        graphics2D.setPaint(Color.yellow);
//        graphics2D.fillOval(200,10,100,100);

        graphics2D.setPaint(Color.red);
        graphics2D.fillArc(10, 10, 100, 100, 0, 180);
        graphics2D.setPaint(Color.white);
        graphics2D.fillArc(10, 10, 100, 100, 180, 180);
        graphics2D.setPaint(Color.black);
        graphics2D.fillOval(45, 45, 30, 30);

        graphics2D.setPaint(Color.black);
        graphics2D.setStroke(new BasicStroke(6));//thickness
        graphics2D.drawLine(13, 60, 107, 60);

        graphics2D.setPaint(Color.white);
        graphics2D.fillOval(52, 52, 15, 15);

        graphics2D.setPaint(new Color(99, 86, 86));
        graphics2D.setFont(new Font("MV Boli", Font.BOLD, 15));
        graphics2D.drawString("This a pokemon ball", 20, 130);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};
        graphics2D.setPaint(Color.yellow);
        graphics2D.fillPolygon(xPoints, yPoints, 3);

    }
}
