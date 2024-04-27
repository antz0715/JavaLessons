import java.util.Scanner;  // Import the Scanner class

public class EchoInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console

        System.out.print("Please enter something: ");  // Prompt the user to enter something
        String input = scanner.nextLine();  // Read user input as a string

        System.out.println("You entered: " + input);  // Output the input back to the user

        scanner.close();  // Close the scanner to free up resources
    }
}
