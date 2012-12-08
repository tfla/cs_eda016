public class Circle {
	private double x;
	private double y;
	private double r;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double getArea() {
		return Math.PI * r * r;
	}

	public void moveTo(double newX, double newY) {
		x = newX;
		y = newY;
	}

	public boolean contains(double x, double y) {
		double dx = this.x-x;
		double dy = this.y-y;
		double dist = Math.hypot(dx,dy);
		return dist < r;
	}
}
