package blackjack;

public class DrawCards {

	private int cardOne;
	private int cardTwo;
	private int hitCard;
	private int storeDealerHiddenCard;
	private int dealerTotal;
	private int playerTotal;
	
	public DrawCards(){
		
	}

	public int getCardOne() {
		return this.cardOne;
	}

	public int getCardTwo() {
		return this.cardTwo;
	}

	public int getHitCard() {
		return hitCard;
	}

	public int getPlayerTotal() {
		this.playerTotal = cardOne + cardTwo;
		return playerTotal;
	}
	
	public int getDealerTotal(){
		dealerTotal = cardOne + storeDealerHiddenCard;
		return dealerTotal;
	}

	public int getPlayerTotalAfterHit() {
		return hitCard;
	}

	public void setCardOne(int cardOne) {
		this.cardOne = cardOne;
	}

	public void setCardTwo(int cardTwo) {
		this.cardTwo = cardTwo;
	}

	public void setHitCard(int hitCard) {
		this.hitCard = hitCard;
	}

	public void setPlayerTotalAfterhit(int hitCard) {
		this.hitCard = hitCard;
	}
	
	public void dealerHand(String dealerName) {
		System.out.println(dealerName + " has a " + getCardOne() + " showing, and a hidden card.");
		storeDealerHiddenCard = getCardTwo();
		System.out.println("His total is hidden, too.");
	}
	
	public void playerhand() {
		System.out.println("You got a " + getCardOne() + " and a " + getCardTwo());
		System.out.println("Your total is : " + getPlayerTotal());
	}
}