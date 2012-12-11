import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.ptdc.window.SimpleWindow;
import java.awt.Color;

public class Circle extends Shape {
	int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public void draw(SimpleWindow w) {
		int corners = 90;
//		w.setLineColor(Color.GREEN);
		w.moveTo(x + r, y);
		double conv = 2 * Math.PI / corners;
		for (int i = 1; i <= corners; i++) {
			double angle = i * conv;
			w.lineTo((int) Math.round(x + r * Math.cos(angle)),
					 (int) Math.round(y + r * Math.sin(angle)));
		}
		w.moveTo(0, 0);
	}

	public String toString() {
		return "C " + x + " " + y + " " + r;
	}
 
	public boolean near(int xc, int yc) {
		return Math.abs(x - xc) < r + 3 && Math.abs(y - yc) < r + 3;
	}
}
