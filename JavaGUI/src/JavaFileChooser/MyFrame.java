package JavaFileChooser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420, 420);
        JButton button = new JButton("Choose file");
        button.setFocusable(false);
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("images", "jpg","png","jpeg"));
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("*.pdf", "pdf"));//allows only txt file
            fileChooser.setAcceptAllFileFilterUsed(false); // donot show all files in file type
//            fileChooser.setCurrentDirectory(new File("."));//opens with project directory
//            int fileChooserResponse = fileChooser.showDialog(null, "choose any file");//selects file to open
            int fileChooserResponse = fileChooser.showSaveDialog(null);//select the file to save
            System.out.println("file chooser response: " + fileChooserResponse);

            if (fileChooserResponse == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            } else if (fileChooserResponse == JFileChooser.CANCEL_OPTION) {
                System.out.println("no files chosen");
            }

        });

        this.add(button);
        this.setVisible(true);

    }
}
