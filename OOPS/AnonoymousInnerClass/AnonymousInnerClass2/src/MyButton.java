import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    MyButton(String text){
        this.setText(text);
        this.setBackground(Color.MAGENTA);
        this.setFocusable(false);
    }
}
