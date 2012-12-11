public class Complex {
	// Beskriver ett komplext tal Complex.
	private double re;
	private double im;

	public Complex(double re, double im) {
		// Konstruktor.
		this.re = re;
		this.im = im;
	}

	public double getRe() {
		// Returnerar den reella delen av det komplexa talet.
		return re;
	}

	public double getIm() {
		// Returnerar den imaginära delen av det komplexa talet.
		return im;
	}

	public double getAbs2() {
		// Returnerar det komplexa talets absolutbelopp i kvadrat.
		return re * re + im * im;
	}

	public void add(Complex c) {
		// Adderar två komplexa tal.
		this.re += c.re;
		this.im += c.im;
	}

	public void mul(Complex c) {
		// Multiplicerar två komplexa tal.
		// Kanske lite omständigt, men det fungerar i alla fall.
		double reResult, imResult;
		reResult = this.re * c.re - this.im * c.im;
		imResult = this.re * c.im + this.im * c.re;
		this.re = reResult;
		this.im = imResult;

	}
}
