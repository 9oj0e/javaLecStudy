package ex09;
// mini project
import javax.swing.*;
import java.awt.*;

public class ImageViewer extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private BorderLayout layoutM;
    private ImageViewer() {
        setTitle("image viewer");
        panel1 = new JPanel();
        JLabel label1 = new JLabel();
        ImageIcon image1 = new ImageIcon("d://images/1.jpg");
        label1.setIcon(image1);
        panel1.add(label1);

        panel2 = new JPanel();
        JButton btn1 = new JButton("<<");
        JButton btn2 = new JButton("<");
        JButton btn3 = new JButton(">");
        JButton btn4 = new JButton(">>");
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);

        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        ImageViewer t = new ImageViewer();
    }
}
