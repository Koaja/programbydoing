package blackjack;

import java.util.Random;

public class Player {

	Random rng = new Random();

	private String player;
	private String dealer;

	DrawCards playerCards = new DrawCards();
	DrawCards dealerCards = new DrawCards();
	
	boolean playerTurn = true;

	public Player(String dealer) {
		this.dealer = dealer;
	}

	public String getplayerName() {
		return player;
	}

	public void setPlayerName(String playerOne) {
		this.player = playerOne;
	}

	public String getDealername() {
		return dealer;
	}

	public boolean isPlayersTurn() {

		if (playerTurn == true) {
			System.out.println(player + "'s turn to play");
			System.out.println("Would you like to 'hit' or 'stay' ?");

			return playerTurn = false;
		} else {
			System.out.println(dealer + "'s turn to play");
			return playerTurn = true;
		}
	}

	public void dealerHand(String dealerName) {
		System.out.println(dealerName + " has a " + dealerCards.getCardOne() + " showing, and a hidden card.");
		dealerCards.getCardTwo();
		System.out.println("His total is hidden, too.");
	}

	public void playerhand() {
		System.out.println("You got a " + playerCards.getCardOne() + " and a " + playerCards.getCardTwo());
		System.out.println("Your total is : " + playerCards.getPlayerTotal());
	}
}
