import java.util.Scanner;

public class DaffyDuckSpeechWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        // StringBuilder to build the output
        StringBuilder daffySpeech = new StringBuilder();
        int index = 0;
        
        // Loop through each character using a while loop
        while (index < input.length()) {
            char c = input.charAt(index);
            // Check if the current character is 's' or 'S'
            if (c == 's') {
                daffySpeech.append("th");
            } else if (c == 'S') {
                daffySpeech.append("Th");
            } else {
                daffySpeech.append(c);
            }
            index++;
        }
        
        // Output the transformed sentence
        System.out.println("Daffy Duck's version:");
        System.out.println(daffySpeech.toString());
        
        // Close the scanner
        scanner.close();
    }
}

