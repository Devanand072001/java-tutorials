package JavaJOptionPane_DialogBoxes;

import javax.swing.*;
import java.awt.*;

/**
 * import java.awt.event.ActionEvent;
 * import java.awt.event.ActionListener;
 */


public class JavaJOptionPane {
    public static void main(String[] args) {
        JButton plainMsgBtn = new JButton("Plain message");
        plainMsgBtn.setBounds(100, 50, 150, 30);
        plainMsgBtn.setFocusable(false);
        plainMsgBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                null,
                "you are using " + System.getProperty("os.name"),
                "plain message",
                JOptionPane.PLAIN_MESSAGE
                )
        );

        JButton warningMsgBtn = new JButton("Warning message");
        warningMsgBtn.setBounds(100, 100, 150, 30);
        warningMsgBtn.setFocusable(false);
        warningMsgBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                null,
                "You have been hacked!",
                "warning",
                JOptionPane.WARNING_MESSAGE
                )
        );

        JButton infoMsgBtn = new JButton("information message");
        infoMsgBtn.setBounds(100, 150, 200, 30);
        infoMsgBtn.setFocusable(false);
        infoMsgBtn.addActionListener(e -> JOptionPane.showMessageDialog(
                null,
                "hello " + System.getProperty("user.name"),
                "Information",
                JOptionPane.INFORMATION_MESSAGE)
        );

        JButton confirmMsg = new JButton("Confirmation message");
        confirmMsg.setBounds(100, 200, 200, 30);
        confirmMsg.setFocusable(false);
        confirmMsg.addActionListener(e -> {
                    int choice = JOptionPane.showConfirmDialog(null,
                            "Do you have brain ?",
                            "confirm message",
                            JOptionPane.YES_NO_CANCEL_OPTION);
                    String msg;
                    if (choice == 0) {
                        msg = "you are man";
                        System.out.println("you are man");
                    } else {
                        msg = "you are foolish zombie";
                        System.out.println("you are foolish zombie");
                    }
                    JOptionPane.showMessageDialog(null, msg, "Brainee msg", JOptionPane.ERROR_MESSAGE);
                }
        );

        JButton costumMsgBtn = new JButton("Custom message");
        costumMsgBtn.setFocusable(false);
        costumMsgBtn.setBounds(100,250,150,30);

        costumMsgBtn.addActionListener(e -> {
            ImageIcon icon = new ImageIcon("icon.png");
            String[] options = {"yes, I do", "no it's bitter", "bhoom"};
            int response =  JOptionPane.showOptionDialog(
                    null,
                    "Do you like Java",
                    "costum message",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,icon,options,0);
            System.out.println(response);
        });


        JFrame frame = new JFrame("JOptionPane");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));

        frame.add(plainMsgBtn);
        frame.add(warningMsgBtn);
        frame.add(infoMsgBtn);
        frame.add(confirmMsg);
        frame.add(costumMsgBtn);
        frame.setSize(new Dimension(420, 420));
        frame.setVisible(true);


    }


}

