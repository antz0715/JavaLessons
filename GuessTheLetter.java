import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {
        // The word to guess
        String word = "elephant";
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to guess a letter
        System.out.print("Guess a letter: ");
        char guessedLetter = scanner.next().charAt(0);
        
        // Check if the guessed letter is in the word
        boolean isLetterInWord = false;
        for (char letter : word.toCharArray()) {
            if (letter == guessedLetter) {
                isLetterInWord = true;
                break;
            }
        }
        
        // Display the result
        if (isLetterInWord) {
            System.out.println("The letter " + guessedLetter + " is in the word!");
        } else {
            System.out.println("The letter " + guessedLetter + " is not in the word.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
