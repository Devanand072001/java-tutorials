package JavaListeners.MouseListeners.DragAndDrop;

import javax.swing.*;
import java.awt.*;
/*import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;*/
import java.awt.event.*;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("logo.png");
   /* final int imgWidth = image.getIconWidth();
    final int imgHeight = image.getIconHeight();*/
    Point imageCorner;
    Point previousPoint;

    DragPanel() {
        imageCorner = new Point(0, 0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xPoint = (int) imageCorner.getX();
        int yPoint = (int) imageCorner.getY();
        image.paintIcon(this, g, xPoint, yPoint);
    }

    private class ClickListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            previousPoint = e.getPoint();
            System.out.println("Previous point: " + previousPoint);
        }
    }

    private class DragListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            Point currentPoint = e.getPoint();
            System.out.println("Current point: " + currentPoint);
            int xTranslate = (int) (currentPoint.getX() - previousPoint.getX());
            int yTranslate = (int) (currentPoint.getY() - previousPoint.getY());

            imageCorner.translate(xTranslate,yTranslate);
            previousPoint = currentPoint;
            repaint();
        }
    }
}
