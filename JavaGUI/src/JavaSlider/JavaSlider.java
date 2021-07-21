package JavaSlider;

import javax.swing.*;
import java.awt.*;

public class JavaSlider {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    ImageIcon volumeLow;
    ImageIcon volumeHigh;


    public JavaSlider() {
        frame = new JFrame("Java Slider");
        panel = new JPanel();
        label = new JLabel();
        volumeLow = new ImageIcon("volume-low.png");

        volumeHigh = new ImageIcon("volume-high.png");

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.addChangeListener(e -> {
            label.setFont(new Font("MV Boli", Font.PLAIN,30));
            label.setText("volume: " + slider.getValue());
        });


        /*label.setIcon(volumeLow);*/
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(450, 420);


        frame.setVisible(true);
    }
}
