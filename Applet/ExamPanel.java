import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class ExamPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(50, 50, 300, 100); // x, y, width, height
        g.setColor(Color.red);
        g.drawString("GONDWANA UNIVERSITY EXAMINATION 2023", 70, 180); // x, y
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exam Frame");
        ExamPanel panel = new ExamPanel();
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
