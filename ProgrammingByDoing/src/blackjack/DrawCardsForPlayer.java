package blackjack;

public class DrawCardsForPlayer extends DrawCards {

	public void drawCardsForPlayer() {
		cardOne = 2 + rng.nextInt(10);
		cardTwo = 2 + rng.nextInt(10);
		setTotal(cardOne, cardTwo);
		System.out.println("You get a " + cardOne + " and a " + cardTwo);
		System.out.println("Your total is : " + getTotal());
	}

}
