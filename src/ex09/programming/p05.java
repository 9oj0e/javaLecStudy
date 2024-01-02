package ex09.programming;
// p05
import javax.swing.*;
import java.awt.*;

public class p05 extends JFrame {
    private p05() {
        setTitle("BMI 계산기");
        setSize(300, 200);
        setLayout(new FlowLayout(0, 5, 5));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel tLabel = new JLabel("나의 BMI 지수는 얼마나 될까?");
        JLabel bwLabel = new JLabel("나의 체중(kg)");
        JLabel hLabel = new JLabel("나의 키(m)");
        JTextField bwText = new JTextField(10);
        JTextField hText = new JTextField(10);
        JButton btn = new JButton("BMI 확인하기");

        panel1.add(tLabel);
        panel2.setLayout(new GridLayout(2, 2));
        panel2.add(bwLabel);
        panel2.add(bwText);
        panel2.add(hLabel);
        panel2.add(hText);

        panel3.add(btn);

        add(panel1);
        add(panel2);
        add(panel3);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        p05 t = new p05();
    }
}
