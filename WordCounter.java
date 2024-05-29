import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the text
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();
        
        // Call the methods to count words, characters, and sentences
        int wordCount = countWords(text);
        int charCount = countCharacters(text);
        int sentenceCount = countSentences(text);
        
        // Display the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of sentences: " + sentenceCount);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to count words
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        
        String[] words = text.split("\\s+");
        return words.length;
    }
    
    // Method to count characters
    public static int countCharacters(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        
        return text.length();
    }
    
    // Method to count sentences
    public static int countSentences(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }
}
