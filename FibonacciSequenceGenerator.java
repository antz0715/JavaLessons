import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int numTerms = scanner.nextInt();
        
        // Generate and display the Fibonacci sequence
        generateFibonacciSequence(numTerms);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to generate and display the Fibonacci sequence
    public static void generateFibonacciSequence(int numTerms) {
        // Handle edge cases for small numbers of terms
        if (numTerms <= 0) {
            System.out.println("Number of terms must be greater than zero.");
            return;
        } else if (numTerms == 1) {
            System.out.println("Fibonacci sequence up to 1 term: 0");
            return;
        }

        // Initialize the first two terms of the Fibonacci sequence
        long firstTerm = 0;
        long secondTerm = 1;
        
        System.out.print("Fibonacci sequence up to " + numTerms + " terms: ");
        
        // Print the first two terms
        System.out.print(firstTerm + ", " + secondTerm);

        // Generate and print the remaining terms
        for (int i = 3; i <= numTerms; i++) {
            long nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        System.out.println();
    }
}
