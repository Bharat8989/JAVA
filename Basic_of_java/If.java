package Basic_of_java;

import java.util.Scanner;

class If {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.next(); // Read full input
        scanner.close();

        // Ensure the input is only one character
        if (input.length() > 1) {
            System.out.println("Error: Please enter only a single character.");
        } else {
            char ch = input.charAt(0);

            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is not a vowel.");
            }
        }
    }
}
