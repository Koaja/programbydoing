package blackjack;

public class DrawCards {

	private int cardOne;
	private int cardTwo;
	private int hitCard;
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
}