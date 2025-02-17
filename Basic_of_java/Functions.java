package Basic_of_java;

public class Functions {

    void Prime(int num) {
        if (num <= 1) {  // Prime numbers are greater than 1
            System.out.println(num + " is not a prime number.");
            return;
        }

        boolean isPrime = true;  // Assume number is prime

        for (int i = 2; i <= num; i++) {  // Check up to √num for efficiency
            if (num % i == 0) {
                isPrime = false; // If divisible, it's not prime
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Functions obj = new Functions();
        obj.Prime(17);  // Example test with 17
        // obj.Prime(20);  // Example test with 20
    }
}
