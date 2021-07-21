package JavaRadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton carBtn;
    JRadioButton cycleBtn;
    JRadioButton bikeBtn;

    public MyFrame() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420, 420);

        carBtn = new JRadioButton("car");
        carBtn.addActionListener(this);
        cycleBtn = new JRadioButton("cycle");
        cycleBtn.addActionListener(this);
        bikeBtn = new JRadioButton("bike");
        bikeBtn.addActionListener(this);

        /*to select only on choice in radio button*/
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(carBtn);
        radioGroup.add(bikeBtn);
        radioGroup.add(cycleBtn);

        this.add(carBtn);
        this.add(bikeBtn);
        this.add(cycleBtn);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = null;
        if (e.getSource() == carBtn) {
            choice = carBtn.getText();
        } else if (e.getSource() == bikeBtn) {
            choice = bikeBtn.getText();
        } else if (e.getSource() == cycleBtn) {
            choice = cycleBtn.getText();
        }
        System.out.println("your have chosen " + choice);
        JOptionPane.showMessageDialog(null, "you have chose " + choice, "button choice", JOptionPane.INFORMATION_MESSAGE);
    }
}
