import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Use if statements to print different messages based on the age input
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        // Close the scanner
        scanner.close();
    }
}
