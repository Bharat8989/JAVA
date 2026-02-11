import java.util.Scanner;

public class Practical3 {

    // Define substitution key
    static String plainAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String cipherAlphabet = "QWERTYUIOPASDFGHJKLZXCVBNM";

    // Method to encrypt
    public static String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
                int index = plainAlphabet.indexOf(ch);
                cipherText.append(cipherAlphabet.charAt(index));
            } else {
                cipherText.append(ch); // Keep spaces & symbols unchanged
            }
        }
        return cipherText.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plain Text: ");
        String plainText = sc.nextLine();

        String cipherText = encrypt(plainText);

        System.out.println("Cipher Text: " + cipherText);

        sc.close();
    }
}
