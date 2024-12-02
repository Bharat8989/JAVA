import javac.Swing.JFame;
import javac.Swing.JLable;
import java.applet.Applet;

import javax.swing.JLabel;

// import javax.swing.JFrame;
class Main extends JFrame
{
    public Main(){
        add(new JLabel("hello world"));
        setSize(300,200);
        setDefaultClosOperation(EXIT_ON_CLOSE);
        setVisiable(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}