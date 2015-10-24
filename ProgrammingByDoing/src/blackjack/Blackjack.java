package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rng = new Random();

		Player player = new Player("Dealer");
		HitOrStay play = new HitOrStay();
		DrawCardsForPlayer playerDraw = new DrawCardsForPlayer();
		DrawCardsForDealer dealerDraw = new DrawCardsForDealer();
		String playerName;
		String dealerName;
		String playHand;

		boolean gameOn = true;

		// assign a name to the player
		System.out.println("Enter your name :");
		player.setPlayerName(input.nextLine());

		// get player names
		playerName = player.getplayerName();
		dealerName = player.getDealername();

		// greet the player
		System.out.println("Welcome " + playerName + " to Koaja's Blackjack program!");

		// Draw cards for player
		playerDraw.drawCardsForPlayer();

		// Draw cards for dealer
		dealerDraw.drawCardsForDealer();
		// Start the game

		//
		while (gameOn) {
			System.out.println("Would you like to 'hit' or 'stay' ");
			playHand = input.nextLine();
			play.playerHitOrStay(playHand);
		}

	}

}
