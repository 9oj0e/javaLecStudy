package ex09.programming;
// p02
import javax.swing.*;

public class p02 extends JFrame {
    private JPanel panel;
    private JLabel nLabel;
    private JTextField vField;
    private JButton btn;
    static int n = 0;
    private p02(){
        setTitle("My Frame");
        panel = new JPanel();
        nLabel = new JLabel("카운터 값");

        vField = new JTextField(n+"", 10);
        vField.setEditable(false);

        btn = new JButton("증가");
        btn.addActionListener(e -> {
            n++;
            vField.setText(n+"");
        });

        panel.add(nLabel);
        panel.add(vField);
        panel.add(btn);

        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);

    }

    public static void main(String[] args) {
        p02 t = new p02();
    }
}
