import java.util.Scanner;

public class CheckAdjacentEqual {
	public static void main(String[] args) {
		int nbrEqual = 0;
		Scanner scan = new Scanner(System.in);

		if (scan.hasNextInt()) {
			int prev = scan.nextInt();
			while (scan.hasNextInt()) {
				int current = scan.nextInt();
				if (current == prev) {
					nbrEqual++;
				}
				prev = current;
			}
		}
		System.out.println("Tal bredvid varandra med samma värde: " + nbrEqual);
	}
}
