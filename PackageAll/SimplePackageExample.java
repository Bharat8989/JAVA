package PackageAll;
import javax.swing.*; // For Swing components
import java.awt.event.*; // For event handling
import java.util.*; // For Scanner

public class SimplePackageExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple Package Example");
        JButton button = new JButton("Click Me");
        
        // Set the action for the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Using Scanner to read input from console
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                
                // Display a greeting dialog
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                
                // Close the scanner
                scanner.close();
            }
        });
        
        // Set up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
