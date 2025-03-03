package Basic_of_java;

public class Fibonacci {

    void printFibonacci(int n) {
        int a = 0, b = 1, sum;
        
        System.out.print("Fibonacci Series: " + a + " " + b + " "); // First two numbers

        for (int i = 2; i < n; i++) { // Loop starts from 2 because 0 & 1 are already printed
            sum = a + b;
            System.out.print(sum + " ");
            a = b;  // Move forward
            b = sum;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.printFibonacci(2); // Print first 10 Fibonacci numbers
    }
}
