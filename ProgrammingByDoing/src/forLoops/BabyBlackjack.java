package forLoops;

import java.util.Random;

public class BabyBlackjack {

	public static void main(String[] args) {

		Random rng = new Random();

		int playerCardOne = rng.nextInt(10);
		int playerCardTwo = rng.nextInt(10);
		int playerTotal = playerCardOne + playerCardTwo;

		int dealerCardOne = rng.nextInt(10);
		int dealerCardTwo = rng.nextInt(10);
		int dealerTotal = dealerCardOne + dealerCardTwo;

		System.out.println("Baby Blackjack");
		System.out.println("You drew " + playerCardOne + " and " + playerCardTwo);
		System.out.println("Your total is :" + playerTotal);

		System.out.println("The dealer drew " + dealerCardOne + " and  " + dealerCardTwo);
		System.out.println("Dealer total is :" + dealerTotal);

		if (playerTotal > dealerTotal) {
			System.out.println("User wins");
		} else if (playerTotal < dealerTotal) {
			System.out.println("Dealer wins");
		} else if (playerTotal == dealerTotal) {
			System.out.println("Its a tie");
		}
	}

}
