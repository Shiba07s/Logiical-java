package Number;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the 1st number : ");
		double num1 = scanner.nextDouble();

		System.out.println("enter the 2nd number : ");
		double num2 = scanner.nextDouble();

		scanner.nextLine();

		// Read the operator
		System.out.println("Enter the character (+, -, *, /): ");
		char operator = scanner.nextLine().charAt(0);

		// Initialize result variable
		double result;
		switch (operator) {
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
				throw new IllegalArgumentException("Division by zero is not allowed.");
				
			}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + operator);
		}
		System.out.println("Total value is : " + result);
		scanner.close();
	}

}
