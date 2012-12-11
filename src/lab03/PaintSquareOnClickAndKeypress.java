import java.awt.Color;

import se.lth.cs.ptdc.square.Square;
import se.lth.cs.ptdc.window.SimpleWindow;

public class PaintSquareOnClickAndKeypress {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClickDists");
		int oldX = 100;
		int oldY = 100;
		Square sq = new Square(oldX, oldY, 200);
		sq.draw(w);
		while (true) {
			w.waitForEvent();
			if (w.getEventType() == SimpleWindow.MOUSE_EVENT) {
				int newX = w.getMouseX();
				int newY = w.getMouseY();
				w.clear();
				sq.move(newX - oldX, newY - oldY);
				sq.draw(w);
				oldX = newX;
				oldY = newY;

			} else if (w.getEventType() == SimpleWindow.KEY_EVENT) {
				w.setLineColor(Color.BLACK);
				switch (w.getKey()) {
				case 'r':
					w.setLineColor(Color.RED);
					break;
				}
			}

		}

	}
}