package ex09;
// ex07
import javax.swing.*;
import java.awt.*;

public class PizzaFrame extends JFrame {
    private PizzaFrame(){
        setSize(600, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("PizzaFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panel.setBackground(Color.BLUE);

        JLabel label1 = new JLabel("피자의 종류를 선택하세요.");
        panelA.add(label1);
        panelA.setBackground(Color.CYAN);

        JButton button1 = new JButton("콤보피자");
        JButton button2 = new JButton("포테이토피자");
        JButton button3 = new JButton("불고기피자");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panelB.add(label2);
        panelB.add(field1);
        panelB.setBackground(Color.GREEN);

        add(panel);
        panel.add(panelA);
        panel.add(panelB);
        setVisible(true);
    }

    public static void main(String[] args) {
        PizzaFrame f = new PizzaFrame();
    }
}
