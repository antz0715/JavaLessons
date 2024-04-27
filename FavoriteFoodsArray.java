import java.util.Scanner;

public class FavoriteFoodsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for reading input

        System.out.print("How many favorite foods do you have? ");
        int numberOfFoods = scanner.nextInt();  // Read the number of foods from the user
        scanner.nextLine(); // Consume the newline left-over

        String[] foods = new String[numberOfFoods];  // Create an array to store the favorite foods

        System.out.println("Enter your favorite foods:");
        for (int i = 0; i < numberOfFoods; i++) {
            System.out.print((i + 1) + ". ");
            foods[i] = scanner.nextLine();  // Read each favorite food into the array
        }

        // Print out all the favorite foods
        System.out.println("\nHere are your favorite foods:");
        for (String food : foods) {
            System.out.println("- " + food);
        }

        scanner.close();  // Close the scanner to free up resources
    }
}
