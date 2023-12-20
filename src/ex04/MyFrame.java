package ex04;

import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("hello");

        JButton btn1 = new JButton("click");
        jf.add(btn1);

        btn1.addActionListener(e -> {
            System.out.println("button clicked");
        }); // event

        jf.setSize(300, 500);
        jf.setVisible(true);
    }
}
