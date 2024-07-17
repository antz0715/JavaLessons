import java.util.Scanner;

public class ModulusDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform the modulus operation
        int result = num1 % num2;

        // Display the result
        System.out.println("The result of " + num1 + " % " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
