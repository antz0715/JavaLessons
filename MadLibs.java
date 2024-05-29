import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for inputs
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();
        
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();
        
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();
        
        System.out.print("Enter a verb ending in -ing: ");
        String verbIng = scanner.nextLine();
        
        // Create the story using the inputs
        String story = "Once upon a time, " + name + " went to " + place + ".\n"
                     + "There, they saw a " + adjective + " " + animal + " " + verbIng + " happily.\n"
                     + name + " couldn't believe their eyes! It was a day to remember.";
        
        // Display the story
        System.out.println("\nHere's your Mad Libs story:");
        System.out.println(story);
        
        // Close the scanner
        scanner.close();
    }
}
