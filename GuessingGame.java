import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();  // Create an instance of the Random class
        int numberToGuess = random.nextInt(100) + 1;  // Generate a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input

        System.out.println("Guess the number between 1 and 100. You have 10 tries!");

        // Allow the user up to 5 guesses
        for (int attempt = 1; attempt <= 10; attempt++) {
            System.out.print("Attempt " + attempt + ": Guess the number: ");
            int userGuess = scanner.nextInt();  // Read the user's guess

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the right number: " + numberToGuess);
                break;  // Exit the loop if the correct number is guessed
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            // Inform the user that they've run out of guesses
            if (attempt == 10) {
                System.out.println("You've used all your guesses. The number was: " + numberToGuess);
            }
        }

        scanner.close();  // Close the scanner to free up resources
    }
}

// The keyword static is used in Java to indicate that a particular field, method, or block of code belongs to the class, rather than instances of the class. 
// When a method or field is declared as static, it can be accessed directly by the class name without needing to instantiate the class.
// This is particularly useful for utility methods or constants that should be available to all instances of a class, or when no instance data is used by the method.
// The main method is declared as static, which means it can be invoked without creating an instance of the GuessingGame class.
// This is crucial because the main method is the entry point of any Java application run from the command line.
// The Java Virtual Machine (JVM) calls the main method without creating an instance of the class, which is why main must be static.