package whileLoop;

import java.util.Scanner;

public class AddingValuesInALoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		int tempNumber = 0 ;

		while (true) {
			System.out.print("I will add the number you give me");
			number = input.nextInt();
			System.out.println("Number: " + number);

			System.out.println("The total so far is: " + (tempNumber + number));
			tempNumber += number;

			if (number == 0) {
				System.out.println("Sum of all numbers is " + tempNumber);
				break;
			}
		}
	}
}
