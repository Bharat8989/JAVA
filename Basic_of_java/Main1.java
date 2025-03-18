package Basic_of_java;

class Main1 {
    void BinaryNumber(int num) {
        int ans = 0;
        int pos = 1;
        while (num > 0) {
            int rem = num % 2;
            num = num / 2;
            ans = ans + (rem * pos);
            pos = pos * 10;
        }
        System.out.println("Binary of " + " is: " + ans);
    }

    public static void main(String args[]) {
        Main1 obj = new Main1(); // Create an object of Main1
        
        // Print binary representation of numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            obj.BinaryNumber(i);
        }

        // Print binary representation of 10
        // obj.BinaryNumber(10);
    }
}
