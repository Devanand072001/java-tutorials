package Java2DGraphics;

import javax.swing.*;
// import java.awt.*;

public class My2DFrame extends JFrame   {
    GraphicsPanel graphicsPanel = new GraphicsPanel();

    My2DFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);

        this.add(graphicsPanel);
        this.pack();
        this.setVisible(true);
    }


}
