//4
import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input
        System.out.print("Enter the upper limit: ");  // Ask the user for the upper limit
        int limit = scanner.nextInt();  // Read the upper limit as an integer

        System.out.println("Squares of numbers from 1 to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            int square = i * i;  // Calculate the square of the current number
            System.out.println("Square of " + i + " = " + square);  // Display the square of the number
        }

        scanner.close();  // Close the scanner to free up resources
    }
}
