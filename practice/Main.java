// 
// Object & Class
// Inheritance
// Polymorphism
// Abstraction
// Encapsulation

// looping statement 
/* there are varies types of looping statement i for loops ii while loops iii do while loops last is nested loops  */
// public class Main {
//   public static void main (String args[])
//     {
//         for(int i=0;i<=20;i++)
//     {
//         System.out.println(i);
//     }
//     }
// }

//while loop 
// public class Main {

//     public static void main(String args[])
//     {
//         int i=10;
//         while (i<=20) {
//             System.out.println(i);
//             i++;
            
//         }
//     }
// }


// do while loop 
// public class Main {

//     public static void main(String args[])
//     {
//         int i=2;
//         do
//         {
//             System.out.println(i);
//             i++;
//         }
//         while(i<=30);
//     }
// }


// Object & Class
// Inheritance
// Polymorphism
// Abstraction
// Encapsulation
// object and class 

// class Main {
//     public void show()
//     {
//         System.out.println("show method run");
//     }
    

//     public static void main(String args[])
//     {
//         int a=20;
//         System.out.println("the value of a:"+a);
//         Main kk=new Main();
        
//         kk.show();
//     }
// }

//   Inheritance
//there are three types of inheritance
//single  Inheritance ii multiLever  Inheritance iii Hierarchical
// Multiple
// Hybrid


// 
// Multiple
// Hybrid
//  single 
// class Main1{
//     public void showA(){
//         System.out.println("A method show ");

//     }
// }
// class Main2 extends Main1{
//     public void showB(){
//         System.out.println("B method show ");

//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Main2 kk=new Main2();
//         kk.showA();
//         kk.showB();
//     }
// }
// Hierarchical 
// class Main1{
//     void showA()
//     {
//         System.out.println("show a method ");
//     }
// }
// class Main2 extends Main1 {

//     void showB(){ 
        
//     }
// }

//abstract
// abstract class Animal{
//     public abstract void showA();
//     public void run(){
//         System.out.println("show the A method");

//     }
// }
// class Animal1 extends Animal{
//     public void showA(){
//         System.out.println("animal 1 method run");

//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Animal1 kk=new Animal1();
//         kk.showA();
//         kk.run();
//     }
// }

// Encapsulation

// class Animal {
//     private String carColor; // Private field to store the car color

//     // Setter method to set the car color
//     public void setColor(String color) {
//         carColor = color;
//     }

//     // Getter method to retrieve the car color
//     public String getColor() {
//         return carColor;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal kk = new Animal(); // Creating an object of Animal class

//         // Setting the car color
//         kk.setColor("red");

//         // Getting and printing the car color
//         System.out.println("Car color is: " + kk.getColor());
//     }
// }


//nested loop 
// public class Main {

//     public static void main(String args[])
//     {
//         for(int i=2;i<=3;i++)
//         for(int j=2;j<=4;j++)
//         {
//             System.out.println(i+" * "+j+" = "+i*j);
//         }
//         System.out.println();
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
// import java.awt.*;

// public class Main {
//     public static void main(String[] args) {
//         Frame frame = new Frame("AWT Example");
//         Button button = new Button("Click Me!");

//         button.setBounds(50, 100, 80, 30); // Set button position
//         frame.add(button); // Add button to frame

//         frame.setSize(300, 200); // Set frame size
//         frame.setLayout(null);   // Disable default layout
//         frame.setVisible(true);  // Make frame visible
//     }
// }


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

/*Write a program in java to create output.txt file using some 
 content in input.txt file. */


//  import java.io.*;

//  class Main {
//     public static void main(String args[])
//     {
//         String inputFile="input.txt";
//         String outputFile="output.txt";
//         try(BufferedReader reader=new BufferedReader(new FileReader(inputFile));
//         BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile)))
//         {
//             String line;
//             while((line=reader.readLine())!=null)
//             {
//                 writer.write(line);
//                 writer.newLine();
//             }
//             System.out.println("file are copied");
//         }
//         catch(IOException e)
//         {
//         e.printStackTrace();
//         }
//     }
//  }


// public class Main {

//     public static void main(String args[])
//     {
       
       
//             Thread thread =new Thread(new Runnable(){
//                 @Override
//                 public void run(){
//                     System.out.println("run method run ");

//                 }
//             });
//             thread.start();
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 5; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
// }
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            // Command to list all Wi-Fi profiles
            String command = "netsh wlan show profiles";
            Process process = Runtime.getRuntime().exec(command);

            // Read the output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("Available Wi-Fi Profiles:");
            while ((line = reader.readLine()) != null) {
                if (line.contains("All User Profile")) {
                    // Extract the Wi-Fi profile name
                    String profileName = line.split(":")[1].trim();
                    System.out.println(profileName);

                    // Command to show details of the Wi-Fi profile (including the key)
                    String profileCommand = "netsh wlan show profile \"" + profileName + "\" key=clear";
                    Process profileProcess = Runtime.getRuntime().exec(profileCommand);
                    BufferedReader profileReader = new BufferedReader(new InputStreamReader(profileProcess.getInputStream()));

                    String profileLine;
                    while ((profileLine = profileReader.readLine()) != null) {
                        if (profileLine.contains("Key Content")) {
                            // Extract the password
                            String password = profileLine.split(":")[1].trim();
                            System.out.println("Password for " + profileName + ": " + password);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class Main {

//     public static void main(String[] args) {
//         String ssid = "Airtel_himanshu 32"; // Replace with your Wi-Fi SSID
//         String password = "air77061"; // Replace with the Wi-Fi password you want to check

//         try {
//             // Command to create a Wi-Fi profile (if not already created)
//             String profileCommand = "netsh wlan add profile filename=\"C:\\path\\to\\your\\profile.xml\"";
//             Process process = Runtime.getRuntime().exec(profileCommand);
//             process.waitFor();

//             // Command to attempt connecting to the Wi-Fi network
//             String connectCommand = "netsh wlan connect name=\"" + ssid + "\"";
//             Process connectProcess = Runtime.getRuntime().exec(connectCommand);

//             // Read output to check if the connection is successful
//             BufferedReader reader = new BufferedReader(new InputStreamReader(connectProcess.getInputStream()));
//             String line;
//             boolean connected = false;
//             while ((line = reader.readLine()) != null) {
//                 if (line.contains("Connection request was completed successfully")) {
//                     connected = true;
//                     break;
//                 }
//             }

//             if (connected) {
//                 System.out.println("Successfully connected to Wi-Fi network: " + ssid);
//             } else {
//                 System.out.println("Failed to connect. Please check the password.");
//             }

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
