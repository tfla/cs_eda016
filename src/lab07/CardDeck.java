import se.lth.cs.ptdc.cardGames.Card;
import java.util.Random;

class CardDeck {
	private Card[] cards;
	private int current;
	private static Random rand = new Random();

	public CardDeck() {
		cards = new Card[52];
		int count = 0;
		for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for (int i = 1; i <= 13; i++) {
				cards[count] = new Card(suit, (i));
				count++;
			}
		}
		current = 0;
	}

	public void shuffle() {
		for (int i = 51; i >= 0; i--) {
			int nbr = rand.nextInt(i + 1);
			Card temp = cards[i];
			cards[i] = cards[nbr];
			cards[nbr] = temp;
		}
	}

	public Card getCard() {
		if (moreCards()){
			current++;
			return cards[current-1];
		}
		else {
			return null;
		}
	}

	public boolean moreCards() {
		return current < 52;
	}
}
