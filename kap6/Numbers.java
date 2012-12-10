public class Number {
	int n = 0;
	
	public Number(int n) {
		this.n = n;
	}

	public boolean isOdd() {
		return n % 2 == 1;
	}

	public boolean isPrime() {
		if (n == 2) {
			return true;
		}
		if (n < 1 || n % 2 == 1) {
			return false;
		}
		int div = 3;
		while (div*div <= n && n%div != 0) {
			div += 2;
		}
		return div*div > n;
	}
}
