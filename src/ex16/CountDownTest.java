package ex16;
// ex02
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

public class CountDownTest extends JFrame {
    private JLabel label;
    class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { // InterruptedException 예외 처리
                    e.printStackTrace();
                }
                label.setText(i + " ");
            }
        }
    }
    public CountDownTest() {
        setTitle("카운트다운");
        setSize(400, 150);
        label = new JLabel("Start");
        label.setFont(new Font("Serif", Font.BOLD, 100));
        add(label);
        setVisible(true);
        new MyThread().start();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CountDownTest t = new CountDownTest();
        System.out.println("안녕");
    }
}
