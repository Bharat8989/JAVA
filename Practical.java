import java.util.Scanner;
public class Practical {
    // Method to encrypt text using Caesar Cipher
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        // Force input to lowercase for consistency
             text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLowerCase(ch)) {
                char c = (char) ((ch - 'a' + key) % 26 + 'a');
                result.append(c);
            } else {
                result.append(ch);
            }
        }
        // Convert encrypted text to uppercase
        return result.toString().toUpperCase();
    }
    // Method to decrypt text using Caesar Cipher
    public static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                char c = (char) ((ch - 'A' - key + 26) % 26 + 'A');
                result.append(c);
            } else {
                result.append(ch);
            }
        }
        // Convert decrypted text to uppercase
        return result.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text (lowercase recommended): ");
        String text = sc.nextLine();
        System.out.print("Enter the key (shift value): ");
        int key = sc.nextInt();
        String cipherText = encrypt(text, key);
        System.out.println("Encrypted text (UPPERCASE): " + cipherText);
        String plainText = decrypt(cipherText, key);
        System.out.println("Decrypted text (UPPERCASE): " + plainText);

        sc.close();
    }
}
// OUTPUT:
// Enter the text (lowercase recommended): i love computer system
// Enter the key (shift value): 18
// Encrypted text (UPPERCASE): A DGNW UGEHMLWJ KQKLWE
// Decrypted text (UPPERCASE): I LOVE COMPUTER SYSTEM