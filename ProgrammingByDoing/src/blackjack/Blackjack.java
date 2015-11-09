package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random rng = new Random();

		Player player = new Player("Dealer");
		DrawCards playerCards = new DrawCards();
		DrawCards dealerCards = new DrawCards();

		String playerName;
		String dealerName;
		String userChoice;

		int playerTotal;
		int dealerTotal;

		// assign player cards
		playerCards.setCardOne(2 + rng.nextInt(10));
		playerCards.setCardTwo(2 + rng.nextInt(10));
		playerTotal = playerCards.getPlayerTotal();

		// assing dealer cards
		dealerCards.setCardOne(2 + rng.nextInt(10));
		dealerCards.setCardTwo(2 + rng.nextInt(10));
		dealerTotal = dealerCards.getDealerTotal();

		// Assign a name to the player
		System.out.println("Enter your name : ");
		player.setPlayerName(input.nextLine());

		// Get player names
		playerName = player.getplayerName();
		dealerName = player.getDealername();

		// Greet the player
		System.out.println("Welcome " + playerName + " to Koaja's Blackjack program!\n");

		// Draw cards for player
		System.out.println("You got a " + playerCards.getCardOne() + " and a " + playerCards.getCardTwo());
		System.out.println("Your total is : " + playerCards.getPlayerTotal() + "\n");

		// Draw cards for dealer
		System.out.println(dealerName + " has a " + dealerCards.getCardOne() + " showing, and a hidden card.");
		System.out.println("His total is hidden, too.\n");

		// Players turn
		do {
			System.out.print("Would you like to 'hit' or 'stay' ");
			userChoice = input.nextLine();
			if (userChoice.equals("hit")) {
				int playerCardThree = 2 + rng.nextInt(10);
				System.out.println("You drew " + playerCardThree);
				System.out.println("Your total is now : *" + (playerTotal + playerCardThree) + "*\n");
				playerTotal += playerCardThree;
				if (playerTotal > 21) {
					System.out.println("Your total is was 21. \n");
					System.out.println("*************");
					System.out.println(dealerName + " WINS.");
					System.out.println("*************");
					System.exit(1);
				}
			} else if (userChoice.equals("stay")) {
				System.out.println(dealerName + "s turn.\n");
				break;
			}
		} while (!userChoice.equals("stay"));

		// Show dealers secret card
		System.out.println(dealerName + " s hidden card was " + dealerCards.getCardTwo());
		System.out.println("His total was " + dealerCards.getDealerTotal() + "\n");

		// Dealers turn
		while (dealerTotal <= 15) {
			System.out.println(dealerName + " chooses to hit.");
			int dealerCardThree = 2 + rng.nextInt(10);
			System.out.println(dealerName + " draws a " + dealerCardThree);
			System.out.println("His total is now : *" + (dealerTotal + dealerCardThree) + "*\n");
			dealerTotal += dealerCardThree;
			if (dealerTotal > 21) {
				System.out.println(dealerName + " total is over 21.\n");
				System.out.println("*************");
				System.out.println(playerName + " WINS.");
				System.out.println("*************");
				System.exit(1);
			} else if (dealerTotal >= 15) {
				System.out.println(dealerName + " decided to stay.\n");
				break;
			}
		}
		// Compare outcome
		if (dealerTotal > playerTotal) {
			System.out.println("*************");
			System.out.println(dealerName + " WINS.");
			System.out.println("*************");
		} else if (dealerTotal < playerTotal) {
			System.out.println("*************");
			System.out.println(playerName + " Wins");
			System.out.println("*************");
		} else {
			System.out.println("*************");
			System.out.println("Its a tie");
			System.out.println("*************");
		}

	}
}
