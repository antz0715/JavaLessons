import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a word or phrase
        System.out.println("Enter a word or phrase: ");
        String input = scanner.nextLine();
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check if the cleaned input is a palindrome
        boolean isPalindrome = isPalindrome(cleanedInput);
        
        // Display the result
        if (isPalindrome) {
            System.out.println("The word or phrase is a palindrome!");
        } else {
            System.out.println("The word or phrase is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
