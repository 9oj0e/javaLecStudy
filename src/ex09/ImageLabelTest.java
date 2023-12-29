package ex09;
// ex04
import javax.swing.*;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    private ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(500,400);

        panel = new JPanel();
        label = new JLabel("Dog");
        label.setLocation(0, 0);
        ImageIcon icon = new ImageIcon("d://dog.jpg"); // 불러올 이미지 파일 경로
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요!");

        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        ImageLabelTest t = new ImageLabelTest();
    }
}
