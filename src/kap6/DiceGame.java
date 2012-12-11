public class DiceGame {
	public static void main(String[] args) {
		Die die = new Die();
		int p1 = 0;
		int p2 = 0;
		
		while (p1 <= 100 && p2 <= 100) {
			die.roll();
			p1 += die.getResult();
			if (p1 <= 100) {
				p2 += die.getResult();
			}
		}
		if (p1 > 100) {
			System.out.println("Spelare ett vann!");
		}
		else {
			System.out.println("Spelare två vann!");
		}
	}
}
