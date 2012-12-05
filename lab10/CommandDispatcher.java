//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.ptdc.window.SimpleWindow;

public class CommandDispatcher {
	private SimpleWindow w;
	private ShapeList shapes;

	public CommandDispatcher(SimpleWindow w, ShapeList shapes) {
		this.w = w;
		this.shapes = shapes;
	}

	public void mainLoop() {
		while (true) {
			w.waitForMouseClick();
			int shapeX = w.getMouseX();
			int shapeY = w.getMouseY();
			Shape shape = shapes.findHit(shapeX, shapeY);
//			Shape shape = shapes.near(shapeX, shapeY);
			if (shape != null) {
				w.waitForMouseClick();
				int newX = w.getMouseX();
				int newY = w.getMouseY();
				shape.moveToAndDraw(w, newX, newY);
			}
//			PrintWriter out = null;
//			try {
//				out = new PrintWriter(new File("shapedata.txt"));
//			} catch (FileNotFoundException e) {
//				System.err.println("Filen shapedata.txt kunde inte skrivas.");
//				System.exit(1);
//			}
//			if (shapePos[i] == 'S') {
//				out.println("S " + x, y, s);
//			} else if (shapePos[i] == 'T') {
//				out.println("T " + x, y, s);
//			} else if (shapePos[i] == 'C') {
//				out.println("C " + x, y, r);
//			}
		}
	}
}
