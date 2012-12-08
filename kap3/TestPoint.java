public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(50,50);
		Point p2 = new Point(20,25);
		System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
		p2.move(0,5);
		System.out.println("p22 (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("Avstånd från origo (p1): " + p1.getDistanceToOrigo());
		System.out.println("Avstånd från origo (p2): " + p2.getDistanceToOrigo());
	}
}
