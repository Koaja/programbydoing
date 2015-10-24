package blackjack;

public class DrawCardsForDealer extends DrawCards{

	public void drawCardsForDealer() {
		cardOne = 2 + rng.nextInt(10);
		cardTwo = 2 + rng.nextInt(10);
		setTotal(cardOne, cardTwo);
		System.out.println("The dealer has a " + cardOne + " showing, and a hidden card");
		System.out.println("His total is hidden, too");
	}
}
