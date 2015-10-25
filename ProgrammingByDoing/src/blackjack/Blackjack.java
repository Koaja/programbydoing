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
		DrawCards playerCards = new DrawCards();
		DrawCards dealerCards = new DrawCards();

		String playerName;
		String dealerName;
		String playHand;

		playerCards.setCardOne(2 + rng.nextInt(10));
		playerCards.setCardTwo(2 + rng.nextInt(10));
		
		dealerCards.setCardOne(2 + rng.nextInt(10));
		dealerCards.setCardTwo(2 + rng.nextInt(10));
		
		boolean gameOn = true;

		// Assign a name to the player
		System.out.println("Enter your name : ");
		player.setPlayerName(input.nextLine());

		// Get player names
		playerName = player.getplayerName();
		dealerName = player.getDealername();

		// Greet the player
		System.out.println("Welcome " + playerName + " to Koaja's Blackjack program!");

		// Draw cards for player
		player.playerhand();
		// Draw cards for dealer
		player.dealerHand(dealerName);
		// Start the game

		//
		while (gameOn) {
			System.out.println("Would you like to 'hit' or 'stay' ");
			playHand = input.nextLine();
			play.playerHitOrStay(playHand);
		}

	}

}
