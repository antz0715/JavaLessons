import java.util.Scanner;
import java.lang.Math; // Importing Math library for additional operations

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, %, ^, r for sqrt): ");
            char operator = scanner.next().charAt(0);

            double result = calculate(num1, num2, operator);
            if (!Double.isNaN(result)) {
                System.out.printf("Result: %.2f\n", result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            keepRunning = response.equalsIgnoreCase("yes");
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero error.");
                    return Double.NaN; // Not a Number when divide by zero
                } else {
                    return num1 / num2;
                }
            case '%':
                if (num2 == 0) {
                    System.out.println("Division by zero error.");
                    return Double.NaN; // Not a Number when divide by zero
                } else {
                    return num1 % num2;
                }
            case '^':
                return Math.pow(num1, num2);
            case 'r':
                if (num1 < 0) {
                    System.out.println("Cannot calculate square root of a negative number.");
                    return Double.NaN;
                } else {
                    return Math.sqrt(num1);
                }
            default:
                System.out.println("Invalid operator.");
                return Double.NaN; // Not a Number for invalid operation
        }
    }
}
