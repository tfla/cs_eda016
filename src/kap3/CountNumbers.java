import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		int nbrGreater = 0;
		int nbrSmaller = 0;
		Scanner scan = new Scanner(System.in);
		double firstNbr = scan.nextDouble();
		for (int i = 2; i <= 101; i++) {
			double nbr = scan.nextDouble();
			if (nbr > firstNbr) {
				nbrGreater++;
			}
			else if (nbr < firstNbr) {
				nbrSmaller++;
			}
		}
		System.out.println(nbrGreater + " tal är större.");
		System.out.println(nbrSmaller + " tal är mindre.");
		System.out.println("än " + firstNbr);
	}
}
