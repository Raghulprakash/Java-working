package practice;

import java.util.Scanner;

public class CalculatorFunction {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = num.nextInt();
		System.out.println("Enter the Second number: ");
		int b = num.nextInt();
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = num.next().charAt(0);
		int result;
		switch (operator) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("Error!!!!");
			return;
		}
		System.out.println("The Result is:" + a + operator + b + "=" + result);
	}

}
