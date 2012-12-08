import java.util.Scanner;

public class TestFibonacci {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println("Ange hur många tal som ska visas: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println("Fibonaccis talserie: ");
		for (int i = 0; i < n; i++) {
			System.out.print(fib.fibonacciNbr(i) + " ");
		}
	}
}
