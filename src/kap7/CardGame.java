import se.lth.cs.ptdc.cardGames.*;

public class CardGame {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		while (deck.moreCards()) {
			p1.drawCard(deck);
			if (deck.moreCards()) {
				p2.drawCard(deck);
			}
		}
		Player winner = (p1.getNbrSpades() > p2.getNbrSpades()) ? p1 : p2;
		System.out.println("Spelare nummer " + winner.getNbr() + "vann!");
	}
}
