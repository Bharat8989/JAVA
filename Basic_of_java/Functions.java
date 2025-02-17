package Basic_of_java;

public class Functions {

    void printPrimes(int n) {
        for (int num = 2; num <= n; num++) {  // Loop from 2 to n (100)
            if (isPrime(num)) {  // Check if num is prime
                System.out.print(num + " ");
            }
        }
    }

    boolean isPrime(int num) {  // Function to check if a number is prime
        if (num <= 1) return false; // Prime numbers are greater than 1

        for (int i = 2; i <= num; i++) {  // Check divisibility up to √num
            if (num % i == 0) {
                return false;  // If divisible, not a prime number
            }
        }
        return true;  // If not divisible, it's prime
    }

    public static void main(String[] args) {
        Functions obj = new Functions();
        System.out.println("Prime numbers from 1 to 100:");
        obj.printPrimes(200);  // Print prime numbers up to 100
    }
}
