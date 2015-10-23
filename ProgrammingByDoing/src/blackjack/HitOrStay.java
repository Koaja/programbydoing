package blackjack;

import java.util.Random;

public class HitOrStay {

	Random rng = new Random();

	int cardOne;
	int cardTwo;
	String playerChoice = " ";

	public int getCardOne() {
		return cardOne;
	}

	public int getCardTwo() {
		return cardTwo;
	}

	public void setCardOne(int cardOne) {
		this.cardOne = cardOne;
	}

	public void setCardTwo(int cardTwo) {
		this.cardTwo = cardTwo;
	}

	public void hitOrStay() {
		if (playerChoice.equals("hit")) {
			
		}
	}
}
