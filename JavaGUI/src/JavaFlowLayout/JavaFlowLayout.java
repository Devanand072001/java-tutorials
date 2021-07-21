package JavaFlowLayout;

import javax.swing.*;
import java.awt.*;


/*Layout Manager defines the natural layout for components within a container */
/*FlowLayout = places components in a row, sized at their preferred size .
 *               If the horizontal space in the container is too small,
 *               the Flow Layout class uses the next available row.*/
public class JavaFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        frame.add(panel);

        frame.setVisible(true);//recommender to add at the last
    }
}
