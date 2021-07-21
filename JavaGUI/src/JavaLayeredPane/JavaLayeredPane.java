package JavaLayeredPane;

import javax.swing.*;
import java.awt.*;

/*JLayeredPane is a swing container that provides 3D positioning of components
 * eg:depth , z-index
 */
public class JavaLayeredPane {
    public static void main(String[] args) {

        JLabel redLabel = new JLabel("label 1");
        redLabel.setOpaque(true);

        redLabel.setHorizontalTextPosition(JLabel.LEFT);
        redLabel.setVerticalTextPosition(JLabel.CENTER);
        redLabel.setBackground(Color.red);
        redLabel.setBounds(50, 50, 200, 200);

        JLabel orangeLabel = new JLabel("label 2");
        orangeLabel.setOpaque(true);
        orangeLabel.setBackground(Color.orange);
        orangeLabel.setBounds(100, 100, 200, 200);

        JLabel greenLabel = new JLabel("label 3");
        greenLabel.setOpaque(true);
        greenLabel.setBackground(Color.green);
        greenLabel.setBounds(150, 150, 200, 200);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(1, 1, 500, 500);

       /* *layeredPane.add(redLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(orangeLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(greenLabel, JLayeredPane.DRAG_LAYER);*/

        layeredPane.add(redLabel, Integer.valueOf(0));
        layeredPane.add(orangeLabel, Integer.valueOf(2));
        layeredPane.add(greenLabel, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
