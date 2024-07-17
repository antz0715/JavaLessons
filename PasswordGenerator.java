import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get password length from user
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get character type preferences from user
        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean includeDigits = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("yes");

        // Generate and print the password
        String password = generatePassword(length, includeUppercase, includeLowercase, includeDigits, includeSpecial);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    private static String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeDigits, boolean includeSpecial) {
        String characterPool = "";
        
        if (includeUppercase) {
            characterPool += UPPERCASE;
        }
        if (includeLowercase) {
            characterPool += LOWERCASE;
        }
        if (includeDigits) {
            characterPool += DIGITS;
        }
        if (includeSpecial) {
            characterPool += SPECIAL_CHARACTERS;
        }

        if (characterPool.isEmpty()) {
            throw new IllegalArgumentException("At least one character type must be selected");
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        return password.toString();
    }
}
