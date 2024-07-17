import java.util.Scanner;

public class FactorialCalculator {
    
    // Method to calculate factorial using a loop
    public static int factorialUsingLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial using recursion
    public static int factorialUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial using loop
        int factorialLoop = factorialUsingLoop(number);
        System.out.println("Factorial of " + number + " using loop is: " + factorialLoop);

        // Calculate factorial using recursion
        int factorialRecursion = factorialUsingRecursion(number);
        System.out.println("Factorial of " + number + " using recursion is: " + factorialRecursion);

        // Close the scanner
        scanner.close();
    }
}
