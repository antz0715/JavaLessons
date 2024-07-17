import java.util.Scanner;

public class SimpleHangman {
    public static void main(String[] args) {
        // The word to guess
        String word = "elephant";
        // The current state of guessed letters, initialized with underscores
        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '_';
        }
        // Number of wrong guesses allowed
        int maxWrongGuesses = 6;
        int wrongGuesses = 0;
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Main game loop
        while (wrongGuesses < maxWrongGuesses) {
            // Display the current state of guessed letters
            System.out.print("Word: ");
            System.out.println(guessedWord);
            
            // Prompt the user to guess a letter
            System.out.print("Guess a letter: ");
            char guessedLetter = scanner.next().charAt(0);
            
            // Check if the guessed letter is in the word
            boolean isLetterInWord = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessedLetter) {
                    guessedWord[i] = guessedLetter;
                    isLetterInWord = true;
                }
            }
            












            
            // If the guessed letter is not in the word, increment wrongGuesses
            if (!isLetterInWord) {
                wrongGuesses++;
                System.out.println("Wrong guess! You have " + (maxWrongGuesses - wrongGuesses) + " wrong guesses left.");
            }
            
            // Check if the whole word is guessed
            if (new String(guessedWord).equals(word)) {
                System.out.println("Congratulations! You guessed the word: " + word);
                break;
            }
        }
        
        // If the user has used up all wrong guesses, they lose
        if (wrongGuesses == maxWrongGuesses) {
            System.out.println("Sorry, you've been hanged! The word was: " + word);
        }
        
        // Close the scanner
        scanner.close();
    }
}
