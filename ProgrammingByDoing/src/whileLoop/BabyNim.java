package whileLoop;

import java.util.Scanner;

public class BabyNim {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		int removeFromPile;
		boolean gameOn = true;

		String chosenPile;

		while (gameOn) {
			System.out.print("pileA:" + pileA + "\t" + "pileB:" + pileB + "\t" + "pileC:" + pileC + "\n");
			System.out.println("Choose a pile: ");
			chosenPile = input.nextLine();
			if (chosenPile.equals("A")) {
				System.out.println("How many stick do you wish to remove");
				removeFromPile = input.nextInt();
				pileA = pileA - removeFromPile;
			}
			if (chosenPile.equals("B")) {
				System.out.println("How many stick do you wish to remove");
				removeFromPile = input.nextInt();
				pileB = pileB - removeFromPile;
			}
			if (chosenPile.equals("C")) {
				System.out.println("How many stick do you wish to remove");
				removeFromPile = input.nextInt();
				pileC = pileC - removeFromPile;
			}
			if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
				System.out.println("All piles are out of sticks");
				break;
			}
		}
	}
}
