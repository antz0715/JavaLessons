import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a password
        System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine();
        
        // Check if the password is strong
        if (isStrongPassword(password)) {
            System.out.println("The password is strong!");
        } else {
            System.out.println("The password is not strong enough.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a password is strong
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-_=+[]{}|;:',.<>?/".indexOf(c) >= 0) {
                hasSpecialChar = true;
            }
        }
        
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}
