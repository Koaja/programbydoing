package blackjack;

import java.util.Random;
import java.util.Scanner;

public class HitOrStay {

	DrawCardsForPlayer playerDraw = new DrawCardsForPlayer();

	Random rng = new Random();
	Scanner input = new Scanner(System.in);

	int totalAfterHit = playerDraw.getTotal();
			
	String playerChoice = " ";

	public void playerHitOrStay(String playerChoice) {
		do {
			if (playerChoice.equals("hit")) {
				int cardThree = 2 + rng.nextInt(10);
				System.out.println("You drew " + cardThree);
				System.out.println("Your total is now :" + (totalAfterHit + cardThree));
				totalAfterHit += cardThree;
				input.next();
			}
		} while (!playerChoice.equals("stay"));
	}

	public void dealerHitOrStay() {

	}
}
