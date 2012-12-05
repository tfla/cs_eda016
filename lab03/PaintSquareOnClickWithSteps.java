import se.lth.cs.ptdc.square.Square;
import se.lth.cs.ptdc.window.SimpleWindow;

public class PaintSquareOnClickWithSteps {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClickDists");
		int oldX = 100;
		int oldY = 100;
		Square sq = new Square(oldX,oldY,200);
		sq.draw(w);
		while (true) {
			w.waitForMouseClick();
			int newX = w.getMouseX();
			int newY = w.getMouseY();
			for (int i = 0; i < 10; i++){
				sq.move((newX-oldX)/10,(newY-oldY)/10);
				sq.draw(w);
			}
			oldX = newX;
			oldY = newY;
		}
	}
}
