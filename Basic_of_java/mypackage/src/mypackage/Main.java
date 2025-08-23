package mypackage; // package name should be lowercase

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // primitive and non-primitive data types
        int marks;
        char gender;
        String name;
        float pi;
        double fatherMobile;
        long mobile;
        // boolean values; // declared but not used here

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.next();

        System.out.println("Enter your Marks:");
        marks = sc.nextInt();

        System.out.println("Enter your Gender (M/F):");
        gender = sc.next().charAt(0);

        System.out.println("Enter your Mobile Number:");
        mobile = sc.nextLong();

        System.out.println("Enter your Father Mobile Number:");
        fatherMobile = sc.nextDouble();

        System.out.println("Enter your PI value:");
        pi = sc.nextFloat();

        System.out.println("Enter any byte number : ");
        byte number = sc.nextByte(); 

        // Output all values
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Father's Mobile Number: " + fatherMobile);
        System.out.println("PI Value: " + pi);

        sc.close(); // close scanner
    }
}
