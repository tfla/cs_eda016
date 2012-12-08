import se.lth.cs.ptdc.window.SimpleWindow;
import se.lth.cs.ptdc.square.Square;

public class ManySquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(200, 200, "ManySquares");
		Square sq = new Square(50, 50, 10);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				sq.draw(w);
				sq.move(10,0);
			}
			sq.move(-100,10);
		}
	}
}
