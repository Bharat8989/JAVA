import java.util.Scanner;

class Conditional {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);  // Correct the scanner object

        System.out.println("Enter your age:");
        int Age = S.nextInt();  // Correct usage of scanner

        System.out.println("Enter your weight:");
        int Weight = S.nextInt();  // Correct usage of scanner

        if (Age >= 18) {
            if (Weight >= 50) {
                System.out.println("You are eligible for voting.");  // Fix message
            } 
            else {
                System.out.println("You are not eligible for voting.");  // Fix message
            }
            
        } 
    }
}
