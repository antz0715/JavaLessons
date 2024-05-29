import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        // Create an ArrayList to store shopping list items
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Main loop to interact with the user
        while (true) {
            // Display the menu options
            System.out.println("\nShopping List Menu:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    // Add item
                    System.out.print("Enter the item to add: ");
                    String addItem = scanner.nextLine();
                    shoppingList.add(addItem);
                    System.out.println(addItem + " has been added to the shopping list.");
                    break;
                
                case 2:
                    // Remove item
                    System.out.print("Enter the item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (shoppingList.remove(removeItem)) {
                        System.out.println(removeItem + " has been removed from the shopping list.");
                    } else {
                        System.out.println(removeItem + " is not in the shopping list.");
                    }
                    break;
                
                case 3:
                    // View items
                    System.out.println("Shopping List:");
                    for (String item : shoppingList) {
                        System.out.println("- " + item);
                    }
                    break;
                
                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    // Invalid option
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
