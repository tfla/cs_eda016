import se.lth.cs.ptdc.window.SimpleWindow;

public class TestLine {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(100, 100, "TestLine");
		Line l1 = new Line(10,10,50,50);
		Line l2 = new Line(10,20,50,60);
		l1.draw(w);
		l2.draw(w);
		w.waitForMouseClick();
		w.clear();
		l1.move(10,10);
		l2.move(10,10);
		l1.draw(w);
		l2.draw(w);
	}
}
