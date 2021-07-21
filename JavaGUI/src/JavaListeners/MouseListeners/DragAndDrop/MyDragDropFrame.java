package JavaListeners.MouseListeners.DragAndDrop;

import javax.swing.*;

public class MyDragDropFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyDragDropFrame(){
        this.setTitle("Drag and Drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(dragPanel);

        this.setVisible(true);
    }
}
