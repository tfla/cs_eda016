import java.util.Random;

import se.lth.cs.ptdc.window.SimpleWindow;


public class TurtleMove {
	public static void main(String args[]){
		SimpleWindow w = new SimpleWindow(600, 600, "Turtle Move");
		Turtle t = new Turtle(w, 300, 300);
		Random rand = new Random();
		for (int i = 0; i < 1000; i++){
			t.penDown();
			t.forward(rand.nextInt(10)+1);
			t.left(rand.nextInt(361)-181);
		}
	}
}
