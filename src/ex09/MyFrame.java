package ex09;
// ex02
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private MyFrame() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton btn1 = new JButton("Button 1");
        btn1.setBackground(Color.yellow);

        JButton btn2 = new JButton("Button 2");
        btn2.setBackground(Color.green);

        panel.add(btn1);
        panel.add(btn2);
        add(panel);
        setSize(300,150);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
