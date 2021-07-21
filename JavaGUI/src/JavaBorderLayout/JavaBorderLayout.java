package JavaBorderLayout;

import javax.swing.*;
import java.awt.*;
/*
* Layout Manager = Defines the natural layout for components within a container

3 common managers

BorderLayout = 	A BorderLayout places components in five areas: NORTH,SOUTH,WEST,EAST,CENTER.
* All extra space is placed in the center area.*/
public class JavaBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);

        frame.setLayout(new BorderLayout(10, 10));

        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel eastPanel = new JPanel();
        JPanel westPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        JLabel northLabel = new JLabel();
        northLabel.setText("north panel");
        JLabel southLabel = new JLabel();
        southLabel.setText("south panel");
        JLabel eastLabel = new JLabel();
        eastLabel.setText("east panel");
        JLabel westLabel = new JLabel();
        westLabel.setText("west Panel");
        JLabel centerLabel = new JLabel();
        centerLabel.setText("Center panel");

        northPanel.setBackground(Color.red);
        northPanel.add(northLabel);
        southPanel.setBackground(Color.blue);
        southPanel.add(southLabel);
        eastPanel.setBackground(Color.green);
        eastPanel.add(eastLabel);
        westPanel.setBackground(Color.yellow);
        westPanel.add(westLabel);
        centerPanel.setBackground(Color.lightGray);
        centerPanel.add(centerLabel);


        northPanel.setPreferredSize(new Dimension(100, 100));
        southPanel.setPreferredSize(new Dimension(100, 100));
        eastPanel.setPreferredSize(new Dimension(100, 100));
        westPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        /*------------------------------sub panels-------------------------*/
        centerPanel.setLayout(new BorderLayout(5, 5));

        JPanel centerNorthPanel = new JPanel();
        JPanel centerSouthPanel = new JPanel();
        JPanel centerEastPanel = new JPanel();
        JPanel centerWestPanel = new JPanel();
        JPanel centerCenterPanel = new JPanel();

        centerNorthPanel.setBackground(new Color(255, 145, 145));
        centerSouthPanel.setBackground(new Color(145, 160, 255));
        centerEastPanel.setBackground(new Color(149, 255, 145));
        centerWestPanel.setBackground(new Color(251, 255, 145));
        centerCenterPanel.setBackground(new Color(120, 120, 120));

        centerNorthPanel.setPreferredSize(new Dimension(50, 50));
        centerSouthPanel.setPreferredSize(new Dimension(50, 50));
        centerEastPanel.setPreferredSize(new Dimension(50, 50));
        centerWestPanel.setPreferredSize(new Dimension(50, 50));
        centerCenterPanel.setPreferredSize(new Dimension(50, 50));

        centerPanel.add(centerNorthPanel, BorderLayout.NORTH);
        centerPanel.add(centerSouthPanel, BorderLayout.SOUTH);
        centerPanel.add(centerEastPanel, BorderLayout.EAST);
        centerPanel.add(centerWestPanel, BorderLayout.WEST);
        centerPanel.add(centerCenterPanel, BorderLayout.CENTER);
        
        /*-------------------------sub panel-----------------------*/
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);
        /*frame.setResizable(true);*/

        frame.setVisible(true);// recommended to always add at the last


    }
}

