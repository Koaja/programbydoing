package methods;

import java.util.Scanner;

public class BabyCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String operator;

		do {
			System.out.print("> ");
			System.out.println("enter first number");
			a = keyboard.nextDouble();
			System.out.println("enter operator");
			operator = keyboard.next();
			System.out.println("enter second number");
			b = keyboard.nextDouble();

			if (operator.equals("+")) {
				c = add(a, b);
				if (a == 0) {
					System.out.println("Goodbye");
					break;
				}
			} else if (operator.equals("-")) {
				c = subtract(a, b);
				if (a == 0) {
					System.out.println("Goodbye");
					break;
				}
			} else if (operator.equals("*")) {
				c = multiply(a, b);
				if (a == 0) {
					System.out.println("Goodbye");
					break;
				}
			} else if (operator.equals("/")) {
				c = divide(a, b);
				if (a == 0) {
					System.out.println("Goodbye");
					break;
				}
			} else {
				System.out.println("Undefined operator: '" + operator + "'.");
				c = 0;
			}

			System.out.println(c);

		} while (true);
	}

	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}

	public static double subtract(double a, double b) {
		double c = a - b;
		return c;
	}

	public static double multiply(double a, double b) {
		double c = a * b;
		return c;
	}

	public static double divide(double a, double b) {
		double c = a / b;
		return c;
	}
}
