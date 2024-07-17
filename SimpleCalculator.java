import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        scanner.close();
        
        double result = calculate(num1, num2, operator);
        System.out.printf("Result: %.2f\n", result);
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
            default:
                System.out.println("Invalid operator.");
                return Double.NaN; // Not a Number for invalid operation
        }
    }
}
// %: This introduces a format specifier. 
// It tells System.out.printf that what follows is a special code that describes how to format a variable's value for output.
// .2f: This part of the specifier is used for formatting floating-point numbers. The f stands for floating-point number. The .2 tells System.out.printf to format the floating-point number to two decimal places. This means that the number will be displayed rounded to two decimal places.
// \n: This is a newline character. It moves the cursor to the next line after printing the output, so any subsequent output will start from a new line.
