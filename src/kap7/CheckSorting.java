import java.util.Scanner;

public class CheckSorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = Integer.MAX_VALUE;
		int c = 0;
		
		while (scan.hasNextInt()) {
			int current = scan.nextInt();
			c++;
			if (current < max) {
				System.out.println("Tal nummer " + c + " är felsorterat.");
				System.out.println("Det har värdet " + current + ".");
			}
			else {
				max = current;
			}
		}
	}
}
