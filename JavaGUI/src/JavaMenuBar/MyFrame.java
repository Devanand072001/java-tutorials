package JavaMenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        //menu bar menus
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); //alt+f for file
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); //alt+e for exit
        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H); //alt+h for help

        //file menu bar menu item list
        JMenuItem loadItem = new JMenuItem("Load");
        loadItem.addActionListener(e -> System.out.println("File loaded"));
        loadItem.setMnemonic(KeyEvent.VK_L); //l for load
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> System.out.println("File saved"));
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.out.println("File exited"));
        exitItem.setMnemonic(KeyEvent.VK_E);// e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        //edit menu items

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
}
