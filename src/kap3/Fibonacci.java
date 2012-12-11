public class Fibonacci {
	public Fibonacci() {

	}

	public static long fibonacciNbr(int n) {
		long nbr1 = 1;
		long nbr2 = 1;

		for (int i = 2; i <= n; i++) {
			long temp = nbr1+nbr2;
			nbr1 = nbr2;
			nbr2 = temp; 
		}
		return nbr2;
	}
}
