import java.util.Scanner;

public class Practical1 {

       private static final int SHIFT = 3;

    // Encrypt method
    public static String encrypt(String plainText) {
        StringBuilder cipherText = new StringBuilder();
        plainText = plainText.toUpperCase();

        for (char ch : plainText.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                int p = ch - 'A';
                int c = (p + SHIFT) % 26;
                cipherText.append((char) ('A' + c));
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    // Decrypt method
    public static String decrypt(String cipherText) {
        StringBuilder plainText = new StringBuilder();
        cipherText = cipherText.toUpperCase();

        for (char ch : cipherText.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                int c = ch - 'A';
                int p = (c - SHIFT + 26) % 26;
                plainText.append((char) ('A' + p));
            } else {
                plainText.append(ch);
            }
        }
        return plainText.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Plain Text: ");
        String plainText = sc.nextLine();
        String encrypted = encrypt(plainText);
        String decrypted = decrypt(encrypted);
        System.out.println("\nPlaintext  : " + plainText);
        System.out.println("Encrypted  : " + encrypted);
        System.out.println("Decrypted  : " + decrypted);
        sc.close();
    }
}

// OUTPUT:
// Enter Plain Text: i am batch c

// Plaintext  : i am batch c
// Encrypted  : L DP EDWFK F
// Decrypted  : I AM BATCH C
