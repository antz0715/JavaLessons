import java.util.Scanner;

public class CaesarCipher {
    
    // Method to encrypt text using Caesar cipher
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Method to decrypt text using Caesar cipher
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Prompt the user to enter the shift amount
        System.out.print("Enter the shift amount: ");
        int shift = scanner.nextInt();

        // Encrypt the text
        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        // Decrypt the text
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);

        // Close the scanner
        scanner.close();
    }
}
