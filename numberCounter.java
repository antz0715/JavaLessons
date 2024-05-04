// start with this one
import java.util.Scanner;

public class numberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input
        System.out.print("Enter a number: ");  // Prompt the user to enter a number
        int number = scanner.nextInt();  // Read the user input as an integer

        // Using a for loop to count from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);  // Print each number on a new line
            // i =1
            //i = 2
            //
        }

        scanner.close();  // Close the scanner to free up resources
    }
}
