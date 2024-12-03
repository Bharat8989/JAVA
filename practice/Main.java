// 
// Object & Class
// Inheritance
// Polymorphism
// Abstraction
// Encapsulation
/* inheritance there are main 3 types of i single ii)multiLever iii 
 * Single level
Multi-level
Hierarchical
Multiple
Hybrid
multiple and hybrid are both not using the in java 
it use to 
  */
//   single multiLever hierarchical
//   class A{
//     public void showA()
//     {
//         System.out.println("A method run");
//     }
//   }
//   class B extends A{
//     public void showB()
//     {
//         System.out.println("B method run");
//     }
//   }
//   class Main extends A{
//     public static void main(String[] args) {
//         Main kk=new Main();
//         B kkkk=new B();
//         kkkk.showB();
//         kk.showA();
//         // kk.showB();
//     }
//   }
// multiple 
// interface Animal{
//     void showA();
   
// }
// interface Dog{
//     void showB();
// }
// class Main implements Animal,Dog{
//     public void showA(){
//         System.out.println("show a method ");

//     }
//     public void showB(){
//         System.out.println("show b method");
//     }
//     public static void main(String args[]){
//     Main kk=new Main();
//     kk.showA();
//     kk.showB();
//     }
// }


// Polymorphism
// there are two types of polymorphism one is the compile time polymorphism second is the runtime polymorphism
// examples
// same name but different parameter
// class Main {
//     int add(int a ,int b)
//     {
//         return a+b;
//     }
//     int add(int a, int b ,int c)
//     {
//         return a+b+c;
//     }
//     public static void main(String args[])
//     {
//         Main kk=new Main();
//         kk.add(23, 27);
//         kk.add(10, 20, 30);
//         System.out.println("add of two number:"+kk.add());
//         System.out.println("add of three number:"+kk.add());
//     }
// }
// abstract
// abstract class Animal{
//     public abstract void showA();
// }
// class Main extends Animal{
//     public void showA(){
//         System.out.println("show a method for abstract method ");

//     }
//     public static void main (String args[])
//     {
//         Main kk=new Main();
//         kk.showA();
//     }
// }

// lang packages
// class Main {
//     public static void main (String args [])
//     {
//         double squareRoot=Math.sqrt(25);
//         System.out.println("square root of 25:"+squareRoot);
//     }
// }
// import java.util.Scanner;
// import java.util.jar.Attributes.Name;
// class Main {
//     public static void main(String[] args) {
        
//         System.out.println("enter your name :");
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         System.out.println("your name is:"+name);
//     }
// }
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button button = new Button("Click Me!");

        button.setBounds(50, 100, 80, 30); // Set button position
        frame.add(button); // Add button to frame

        frame.setSize(300, 200); // Set frame size
        frame.setLayout(null);   // Disable default layout
        frame.setVisible(true);  // Make frame visible
    }
}


// import java.io.*;

// class Main {
//     public static void main(String[] args) {
//         String inputFile = "input.txt";
//         String outputFile = "output.txt";

//         try (
//             BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
//         ) {
//             String line; 
//             while ((line = reader.readLine()) != null) {
//                 writer.write(line);
//                 writer.newLine();
//             }
//             System.out.println("Files copied successfully.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
// what is 