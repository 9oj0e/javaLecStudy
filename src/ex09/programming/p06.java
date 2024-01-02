package ex09.programming;

import javax.swing.*;

public class p06 extends JFrame {
    private p06(){
        setTitle("");
        JPanel tPanel = new JPanel();
        JPanel panel = new JPanel();
        JLabel title = new JLabel("회원 등록하기");
        JLabel nLabel = new JLabel("이름");
        JLabel pwLabel = new JLabel("패스워드");
        JLabel emailLabel = new JLabel("이메일 주소");
        JLabel pNum = new JLabel("전화 번호");
        JTextField nameTf = new JTextField();
        JPasswordField pw= new JPasswordField();
        JTextField emailTf = new JTextField();
        JTextField pNumTf = new JTextField();
        JButton rBtn = new JButton("등록하기");
        JButton cBtn = new JButton("취소");

        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

    }
}