import java.awt.Color;
import java.util.Random;

import se.lth.cs.ptdc.window.SimpleWindow;

public class TwoTurtlesMove {
	public static void main(String args[]) {
		SimpleWindow w = new SimpleWindow(600, 600, "Turtle Move");
		ColorTurtle t1 = new ColorTurtle(w, 300, 300, Color.RED);
		ColorTurtle t2 = new ColorTurtle(w, 200, 200, Color.BLUE);
		t1.penDown();
		t2.penDown();
		double distance = 50;
		Random rand = new Random();
		while (distance >= 50) {
				t1.forward(rand.nextInt(10) + 1);
				t1.left(rand.nextInt(361) - 181);
				t2.forward(rand.nextInt(10) + 1);
				t2.left(rand.nextInt(361) - 181);
				SimpleWindow.delay(10);
				distance = Math.hypot(t1.getX()-t2.getX(), t1.getY()-t2.getY());
//				System.out.println(distance);
		}

	}
}