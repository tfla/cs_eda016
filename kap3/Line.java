import se.lth.cs.ptdc.window.SimpleWindow;

public class Line {
	public Point start,finish;

	public Line(int xs, int ys, int xf, int yf){
		this.start = new Point(xs, ys);
		this.finish = new Point(xf, yf);
	}

	public double getLength() {
		int dx = start.getX() - finish.getX();
		int dy = start.getY() - finish.getY();
		return Math.hypot(dx,dy);
	}

	public void draw(SimpleWindow w) {	
		w.moveTo(start.getX(),start.getY());
		w.lineTo(finish.getX(),finish.getY());
		w.moveTo(0,0);
	}

	public void move(int dx, int dy) {
		start.move(dx, dy);
		finish.move(dx, dy);
	}
}
