package blackjack;

import java.util.Random;
import java.util.Scanner;

public class HitOrStay {

	Random rng = new Random();
	Scanner input = new Scanner(System.in);

	DrawCards draw = new DrawCards();
	
	int total = draw.getPlayerTotal();

	String playerChoice = " ";

	public void playerHitOrStay(String playerChoice) {

		while (!playerChoice.equals("stay")) {

			if (playerChoice.equals("hit")) {
				int cardThree = 2 + rng.nextInt(10);
				System.out.println("You drew " + cardThree);
				System.out.println("Your total is now : " + (total + cardThree));
				total += cardThree;
				input.next();
			}
			break;
		}
	}

	public void dealerHitOrStay() {
	}
}
