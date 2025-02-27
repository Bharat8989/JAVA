package Basic_of_java;

import java.util.Scanner;

class Main1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *"); // Print on the same line
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
