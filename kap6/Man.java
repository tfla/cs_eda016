import java.util.Random;

public class Man {
	private static Random rand = new Random();
	private double up;
	private int startPos;
	private int stopPos;
	private int nbrSteps;

	public Man(double upProb) {
		up = upProb;
	}
	
	public void climb(int n) {
		startPos = 2+rand.nextInt(n-2);
		nbrSteps = 0;
		int pos = startPos;
		while (pos != 1 && pos != n) {
			if (rand.nextDouble() < up) {
				pos++;
			}
			else {
				pos--;
			}
			nbrSteps++;
		}
		stopPos = pos;
	}

	public void report() {
		System.out.println("Mannen började klättra på pinne " + startPos + ".");
		System.out.println("Han slutade på pinne " + stopPos) + ".";
		System.out.println("Då hade han tagit " + nbrSteps + " steg.");
}
