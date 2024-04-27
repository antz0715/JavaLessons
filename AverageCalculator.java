//4

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input

        System.out.print("How many numbers do you want to average? ");  // Ask how many numbers will be averaged
        int count = scanner.nextInt();  // Read the count of numbers

        double sum = 0;  // Initialize sum to store the total of the numbers
        System.out.println("Enter the numbers:");

        // Loop to read each number and add it to sum
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double number = scanner.nextDouble();  // Read each number as a double
            sum += number;  // Add the number to the sum
        }

        double average = sum / count;  // Calculate the average

        // Output the result
        System.out.println("The average of the entered numbers is: " + average);

        scanner.close();  // Close the scanner to free up resources
    }
}
