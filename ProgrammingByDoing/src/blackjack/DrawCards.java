package blackjack;

import java.util.Random;
import java.util.Scanner;

public class DrawCards {
	Random rng = new Random();
	Scanner input = new Scanner(System.in);

	protected int cardOne;
	protected int cardTwo;
	protected int cardsDrewSum;

	protected int hitCard = 2 + rng.nextInt(10);

	protected int getCardOne() {
		return cardOne;
	}

	protected int getCardTwo() {
		return cardTwo;
	}

	protected void setTotal(int cardOne, int cardTwo) {
		cardsDrewSum = this.cardOne + this.cardTwo;
	}

	protected int getTotal() {
		return cardsDrewSum;
	}
}
