package ex09.example;

import javax.swing.*;

class BasicFrame extends JFrame{
    public BasicFrame(){
        setSize(300, 500);
        setVisible(true);
    }
}
public class MyFrameEx01 {

    static int num = 1;

    public static void main(String[] args) {
        BasicFrame jf = new BasicFrame();
        //jf.setLayout(new BorderLayout());

        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");

        JLabel la1 = new JLabel(num+""); // 문자열 타입으로 형변환하는 방법

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);

        btn1.addActionListener(e -> {
            num++;
            la1.setText(num+"");
        }); // btn1으로 별도로 선언해 준 이유.

        btn2.addActionListener(e -> {
            num--;
            if(num < 0) {
                num = 0;
            }
            la1.setText(num+"");
        });

        jf.setVisible(true);
    }
}
