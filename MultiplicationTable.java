//3

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input
        System.out.print("Enter a number to see its multiplication table up to 10: ");  // Prompt the user to enter a number
        int number = scanner.nextInt();  // Read the user input as an integer

        System.out.println("Multiplication Table for " + number + ":");
        // Loop to print the multiplication table for the entered number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));  // Print each entry of the table
        }

        scanner.close();  // Close the scanner to free up resources
    }
}
