import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        // Array of possible Magic 8-Ball responses
        String[] responses = {
            "It is certain.",
            "Yes, definitely.",
            "Most likely.",
            "Yes.",
            "Signs point to yes.",
            "Reply hazy, try again.",
            "Ask again later.",
            "Better not tell you now.",
            "Don't count on it.",
            "My reply is no."
        };
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate random responses
        Random random = new Random();
        
        // Main loop to keep the game running
        while (true) {
            // Prompt the user to ask a question
            System.out.print("Ask a yes/no question (or type 'quit' to exit): ");
            String question = scanner.nextLine();
            
            // Check if the user wants to quit
            if (question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }
            
            // Get a random response from the Magic 8-Ball
            int index = random.nextInt(responses.length);
            String response = responses[index];
            
            // Display the response
            System.out.println("Magic 8-Ball says: " + response);
        }
        
        // Close the scanner
        scanner.close();
    }
}
