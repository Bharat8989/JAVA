import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldFrame extends JFrame {
    public HelloWorldFrame() {
        // setTitle("Hello World Frame");
        add(new JLabel("Hello World"));
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorldFrame(); 
    }
}
