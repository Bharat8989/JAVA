// using the jFrame 'hello world'
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloWorldFrame extends JFrame{
    public HelloWorldFrame(){
        add(new JLabel("hello world"));
        setSize(700,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String args[])
    {
        new HelloWorldFrame();
    }
}

// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class HelloWorldFrame extends JFrame {
//     public HelloWorldFrame() {
//         // setTitle("Hello World Frame");
//         add(new JLabel("Hello World"));
//         setSize(300, 100);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setVisible(true);
//     }   
//     //what 

//     public static void main(String[] args) {
//         new HelloWorldFrame(); 
//     }
// }
//  import javax.swing.JFrame;
//  import javax.swing.JLabel;
//  class HelloWorldFrame extends JFrame{
//     public HelloWorldFrame(){
//         add(new JLabel("hello world"));
//         setSize(300,100);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setVisible(true);

//     }
//     public static void main(String args [])
//     {
//         new HelloWorldFrame();
//     }
//  }