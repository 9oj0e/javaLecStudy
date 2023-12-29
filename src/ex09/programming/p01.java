package ex09.programming;
// p01
import javax.swing.*;
import java.awt.*;

public class p01 extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton btn1;
    private JButton btn2;
    private p01() {
        setTitle("My Frame");

        panel = new JPanel();
        label = new JLabel("자바는 재미있나요?");
        btn1 = new JButton("Yes");
        btn2 = new JButton("No");
        panel.add(label);
        panel.add(btn1);
        panel.add(btn2);

        add(panel, BorderLayout.NORTH);
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        p01 t = new p01();
    }
}
