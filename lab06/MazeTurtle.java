import se.lth.cs.ptdc.maze.Maze;
import se.lth.cs.ptdc.window.SimpleWindow;

public class MazeTurtle extends Turtle {
	private Maze m;

	public MazeTurtle(SimpleWindow w, int x, int y, Maze m) {
		super(w, x, y);
		this.m = m;
	}

	public void walk() {
		super.turnNorth();
		super.penDown();
		
		while (!m.atExit(super.getX(), super.getY())) {
			if (m.wallAtLeft(super.getDirection(), super.getX(), super.getY()) && !m.wallInFront(super.getDirection(), super.getX(), super.getY())) {
				super.forward(1);
			}
			else if(!m.wallAtLeft(super.getDirection(), super.getX(), super.getY()) && !m.wallInFront(super.getDirection(), super.getX(), super.getY())){
				super.left(90);
				super.forward(1);
			}
			else if (m.wallAtLeft(super.getDirection(), super.getX(), super.getY()) && m.wallInFront(super.getDirection(), super.getX(), super.getY())){
				super.left(270);
				//super.forward(1);
			}
			else if (!m.wallAtLeft(super.getDirection(), super.getX(), super.getY()) && m.wallInFront(super.getDirection(), super.getX(), super.getY())){
				super.left(90);
				super.forward(1);
			}
			SimpleWindow.delay(10);

		}
	}
}