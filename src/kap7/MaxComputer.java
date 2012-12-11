import java.util.Scanner;

public class MaxComputer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int next = Integer.MIN_VALUE;
		while (scan.hasNextInt()) {
			int nbr = scan.nextInt();
			if (nbr > max) {
				next = max;
				max = nbr;
			}
			else if (nbr > next) {
				next = nbr;
			}
		}
		System.out.println("Störst: " + max);
		System.out.println("Näst störst: " + next);
	}
}
