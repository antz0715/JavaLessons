import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt the user to enter their residency status
        System.out.print("Are you a resident? (yes/no): ");
        String residencyInput = scanner.nextLine();
        boolean isResident = residencyInput.equalsIgnoreCase("yes");

        // Check eligibility using || and && operators
        if (age >= 18 && age <= 35 && isResident) {
            System.out.println("You are eligible for the young residents' event.");
        } else if (age > 35 || !isResident) {
            System.out.println("You are not eligible for the young residents' event.");
        } else {
            System.out.println("You do not meet the age requirement for the young residents' event.");
        }

        // Close the scanner
        scanner.close();
    }
}
