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

}