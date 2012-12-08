import java.util.Scanner;

public class TwoDice {
	public static void main(String[] args) {
		Die d1 = new Die();
		Die d2 = new Die();
		int nbrEqual = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange antal kast: ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			d1.roll();
			d2.roll();
			if (d1.getResult() == d2.getResult()) {
				nbrEqual++;
			}
		}
		System.out.println((double)nbrEqual/n*100 + "% av kasten slutade lika");
	}
}
