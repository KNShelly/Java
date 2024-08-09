import java.util.Scanner;

/**
 * This program is a simple calculator that performs basic arithmetic operations:
 * addition, subtraction, multiplication, and division. The user is prompted to
 * enter two numbers and an operation, and the program computes and displays the result.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = inputScanner.nextDouble();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = inputScanner.nextDouble();

        // Prompt the user for the operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = inputScanner.next().charAt(0);

        // Variable to store the result
        double result;

        // Perform the operation based on user input
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + firstNumber + " * " + secondNumber + " = " + result);
                break;
            case '/':
                // Check for division by zero
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation. Please enter +, -, *, or /.");
                break;
        }

        // Close the scanner
        inputScanner.close();
    }
}