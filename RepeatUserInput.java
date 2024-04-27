import java.util.Scanner;

public class RepeatUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        // Ask the user how many times they want to input text
        System.out.print("How many times do you want to repeat the input? ");
        int count = scanner.nextInt();  // Read the number of repetitions
        scanner.nextLine();  // Consume the newline character left in the buffer

        // Ask the user what text they want to repeat
        System.out.print("What text would you like to repeat? ");
        String text = scanner.nextLine();  // Read the text to be repeated

        // Repeat and print the text as many times as specified
        System.out.println("Repeating your text " + count + " times:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + text);
        }

        scanner.close();  // Close the scanner
    }
}
