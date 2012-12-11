import se.lth.cs.ptdc.cardGames.*;

public class Player {
	private int nbr;
	private int nbrSpades;

	public Player(int nbr) {
		this.nbr = nbr;
		nbrSpades = 0;
	}

	public void drawCard(CardDeck deck) {
		Card c = deck.nextCard();
		if (c.getSuit() == Card.HEARTS && deck.moreCards()) {
			c = deck.nextCard();
		}
		if (c.getSuit() == Card.SPADES) {
			nbrSpades++;
		}
	}

	public int getNbr() {
		return nbr;
	}

	public int getNbrSpades() {
		return nbrSpades;
	}
}
