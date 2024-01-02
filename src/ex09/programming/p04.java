package ex09.programming;
// p04
import javax.swing.*;
import java.awt.*;

public class p04 extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private p04() {
        setTitle("JLabel Test");
        setSize(300,200);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(20, 10));
        JPanel subPanel1 = new JPanel();
        JLabel tLabel1 = new JLabel("RED");
        tLabel1.setHorizontalAlignment(JLabel.CENTER); // gpt3.5
        subPanel1.setBackground(Color.RED);
        subPanel1.setLayout(new BorderLayout()); // gpt3.5, FlowLayout은 컴포넌트의 크기를 무시하고 컨테이너 내에서 정렬한다.
        subPanel1.setPreferredSize(new Dimension(50, 50)); // gpt3.5

        panel1.add(tLabel1, BorderLayout.NORTH);
        panel1.add(subPanel1, BorderLayout.CENTER);
        add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(20, 10));
        JPanel subPanel2 = new JPanel();
        JLabel tLabel2 = new JLabel("YELLOW");
        tLabel2.setHorizontalAlignment(JLabel.CENTER);
        subPanel2.setBackground(Color.YELLOW);
        subPanel2.setLayout(new BorderLayout());
        subPanel2.setPreferredSize(new Dimension(50, 50));
        panel2.add(tLabel2, BorderLayout.NORTH);
        panel2.add(subPanel2, BorderLayout.CENTER);
        add(panel2);

        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(20, 10));
        JPanel subPanel3 = new JPanel();
        JLabel tLabel3 = new JLabel("GREEN");
        tLabel3.setHorizontalAlignment(JLabel.CENTER);
        subPanel3.setBackground(Color.GREEN);
        subPanel3.setLayout(new BorderLayout());
        subPanel3.setPreferredSize(new Dimension(50, 50));
        panel3.add(tLabel3, BorderLayout.NORTH);
        panel3.add(subPanel3, BorderLayout.CENTER);
        add(panel3);

        panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(20, 10));
        JPanel subPanel4 = new JPanel();
        JLabel tLabel4 = new JLabel("BLUE");
        tLabel4.setHorizontalAlignment(JLabel.CENTER);
        subPanel4.setBackground(Color.BLUE);
        subPanel4.setLayout(new BorderLayout());
        subPanel4.setPreferredSize(new Dimension(50, 50));
        panel4.add(tLabel4, BorderLayout.NORTH);
        panel4.add(subPanel4, BorderLayout.CENTER);
        add(panel4);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        p04 t = new p04();
    }
}
