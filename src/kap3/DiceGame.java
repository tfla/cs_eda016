public class DiceGame {
	public static void main(String[] args) {
		int currentPlayer = 1;
		Die die = new Die();
		die.roll();
		while (die.getResult() != 6) {
			if (currentPlayer == 1) {
				currentPlayer = 2;
			}
			else if (currentPlayer == 2) {
				currentPlayer = 1;
			}
			die.roll();
		}
		System.out.println("Spelare " + currentPlayer + " vann.");
	}
}
