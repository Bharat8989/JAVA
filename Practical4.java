import java.util.Scanner;

public class Practical4 {

    // Method to encrypt text
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                int shift = key.charAt(j % key.length()) - 'A';
                char encryptedChar = (char) ((ch - 'A' + shift) % 26 + 'A');
                result.append(encryptedChar);
                j++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to decrypt text
    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        key = key.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                int shift = key.charAt(j % key.length()) - 'A';
                char decryptedChar = (char) ((ch - 'A' - shift + 26) % 26 + 'A');
                result.append(decryptedChar);
                j++;
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Polyalphabetic Cipher =====");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {

                System.out.print("Enter Plain Text: ");
                String plainText = sc.nextLine();

                System.out.print("Enter Key (Alphabets only): ");
                String key = sc.nextLine();

                String cipherText = encrypt(plainText, key);
                System.out.println("Encrypted Text: " + cipherText);

            } else if (choice == 2) {

                System.out.print("Enter Cipher Text: ");
                String cipherText = sc.nextLine();

                System.out.print("Enter Key (Alphabets only): ");
                String key = sc.nextLine();

                String plainText = decrypt(cipherText, key);
                System.out.println("Decrypted Text: " + plainText);

            } else if (choice == 3) {

                System.out.println("Exiting Program...");
                break;

            } else {

                System.out.println("Invalid Choice! Try Again.");
            }
        }

        sc.close();
    }
}
