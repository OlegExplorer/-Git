import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public void myWindow() {
        setTitle("Прога вер. 1.0");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 500);
        setLayout(new GridLayout(3, 1));
        JLabel jlbLabel1 = new JLabel("Методическое пособие по устройствам самообслуживания",JLabel.CENTER);
        JLabel jlbLabel2 = new JLabel("Text Only Label");
        JLabel jlbLabel3 = new JLabel("Text Only Label");

        setLayout(new BorderLayout());

        add(jlbLabel1,  BorderLayout.NORTH);
//        add(jlbLabel2);
//        add(jlbLabel3);
        setVisible(true);

    }

    public static void main(String[] args) {
        MyWindow mywindow = new MyWindow();
        mywindow.myWindow();
    }
}

