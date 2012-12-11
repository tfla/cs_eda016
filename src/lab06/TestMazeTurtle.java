import java.util.Scanner;

import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.ptdc.window.SimpleWindow;


public class TestMazeTurtle {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Maze m = new Maze(scan.nextInt());
		SimpleWindow w = new SimpleWindow(600, 600, "TurtleMaze");
		m.draw(w);
		MazeTurtle t = new MazeTurtle(w, m.getXEntry(), m.getYEntry(), m);
		t.walk();
	}
}
