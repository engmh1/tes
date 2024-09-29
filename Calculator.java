import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user for an operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        // Perform the chosen operation
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}
