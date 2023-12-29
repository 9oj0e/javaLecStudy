package ex09.programming;

import javax.swing.*;
import java.awt.*;

public class p03 extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel tLabel;
    private JButton[] btns;
    private String[] contents = {
        "1일", "2일", "3일", "4일", "5일"
    };
    private p03() {
        setTitle("My Frame");
        setSize(400, 150);
        panel1 = new JPanel();
        panel2 = new JPanel();
        tLabel = new JLabel("호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        panel1.add(tLabel);

        btns = new JButton[5];
        for (int rows = 0; rows < 5; rows++) {
            btns[rows] = new JButton(contents[rows]);
            panel2.add(btns[rows]);
        }
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        p03 t = new p03();
    }
}
