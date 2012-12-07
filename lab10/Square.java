import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.ptdc.window.SimpleWindow;
import java.awt.Color;

public class Square extends Shape {
    int s;

    public Square(int x, int y, int s) {
        super(x, y);
        this.s = s;
    }

    public void draw(SimpleWindow w) {
//        w.setLineColor(Color.RED);
		w.moveTo(x, y);
		w.lineTo(x + s, y);
		w.lineTo(x + s, y + s);
		w.lineTo(x, y + s);
		w.lineTo(x, y);
		w.moveTo(0, 0);
    }

    public boolean near(int xc, int yc) {
		return closeToLine(x, y, x+s, y+s, xc, yc);
    }
    
    public String toString() {
        return "S " + x + " " + y + " " + s;
    }

    public boolean closeToLine(int xi, int yi, int xf, int yf, int xc, int yc) {
		int point1XDist = xc-xi;
		int point1YDist = yc-yi;
		int hypot1 = (int)Math.hypot(point1XDist, point1YDist);
		int point2XDist = xc-xf;
		int point2YDist = yc-yf;
		int hypot2 = (int)Math.hypot(point2XDist, point2YDist);
		int length = (int)Math.hypot((xf-xi),(yf-yi));
		return hypot1+hypot2 < length+3;
	}
}
