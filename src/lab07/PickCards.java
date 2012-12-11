//import se.lth.cs.ptdc.cardGames.CardDeck;

import se.lth.cs.ptdc.cardGames.Card;

public class PickCards {
	public static void main(String[] args) {
		int fail = 0;
		CardDeck deck;
		int turns = 1000000;
		for (int i = 0; i < turns; i++) {
			deck = new CardDeck();
			deck.shuffle();
			int counter = 0;
			boolean keep = true;
			while (deck.moreCards() && keep) {
				if (counter < 3) {
					counter++;
				} else {
					counter = 1;
				}
				//System.out.println(counter);
				Card c = deck.getCard();
				if (c.getRank() == counter) {
					keep = false;
					fail++;
				}
/*				String suitString = "";
				switch (c.getSuit()) {
				case Card.SPADES:
					suitString = "Spades";
					break;
				case Card.HEARTS:
					suitString = "Hearts";
					break;
				case Card.DIAMONDS:
					suitString = "Diamonds";
					break;
				case Card.CLUBS:
					suitString = "Clubs";
					break;
				}
				System.out.println(c.getRank() + " of " + suitString); */
			}
		}
		System.out.println("Lyckade gånger: " + (turns-fail));
		System.out.println("Sannolikhet: " + (double)(turns-fail)/turns);
	}
}