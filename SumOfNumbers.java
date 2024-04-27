//2

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input
        System.out.print("Enter a number: ");  // Prompt the user to enter the upper limit 'n'
        int n = scanner.nextInt();  // Read the user input as an integer

        int sum = 0;  // Initialize the sum variable to store the total sum

        // Loop from 1 to n, inclusive, adding each number to sum
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add the current number to the sum
        }

        // Output the total sum to the console
        System.out.println("The sum of all numbers from 1 to " + n + " is: " + sum);

        scanner.close();  // Close the scanner to free up resources
    }
}
