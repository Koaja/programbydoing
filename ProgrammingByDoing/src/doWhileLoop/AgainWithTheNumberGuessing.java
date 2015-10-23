package doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();

		int guess;
		int value = rnd.nextInt(10);
		int tries = 0;
		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");

		do {
			guess = input.nextInt();
			System.out.println("Your guess: " + guess);
			if (guess != value) {
				System.out.println("That is incorrect. Try Again");
			}
			tries++;
		} while (value != guess);
		System.out.println("That's right!  You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");

	}
}
