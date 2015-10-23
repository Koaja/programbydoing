package doWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class FlipAgain {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again ;

		// while (again.equals("y")) {
		// int flip = rng.nextInt(2);
		// String coin;
		//
		// if (flip == 1)
		// coin = "HEADS";
		// else
		// coin = "TAILS";
		// System.out.println("You flip a coin and it is... " + coin);
		//
		// System.out.print("Would you like to flip again (y/n)? ");
		// again = keyboard.next();
		
		do {
			int flip = rng.nextInt(2);
			String coin;

			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";
			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			again = keyboard.next();
		} while (again.equals("y"));
	}
}
