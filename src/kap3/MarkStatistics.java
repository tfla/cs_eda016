import java.util.Scanner;

public class MarkStatistics {
	public static void main(String[] args) {
		int totalMarks = 0;
		int nbrFailed = 0;
		int nbrPassed = 0;
		int sumPassed = 0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int mark = scan.nextInt();
			totalMarks++;
			if (mark == 0) {
				nbrFailed++;
			}
			else {
				nbrPassed++;
				sumPassed += mark;
			}
		}
		System.out.println("Antal betyg: " + totalMarks);
		System.out.println("Antal underkända: " + nbrFailed);
		if (nbrPassed > 0) {
			System.out.println("Medelbetyg = " + (double)sumPassed/nbrPassed);
		}
		else {
			System.out.println("Inga godkända betyg.");
		}
	}
}
