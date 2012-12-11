import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.ptdc.window.SimpleWindow;
import java.awt.Color;

public class Triangle extends Shape {
	int s;
	
	public Triangle(int x, int y, int s) {
		super(x, y);
		this.s = s;
	}
	
	public void draw(SimpleWindow w){
//		w.setLineColor(Color.BLUE);
		w.moveTo(x,y);
		w.lineTo(x+s/2,y-s);
		w.lineTo(x+s,y);
		w.lineTo(x,y);
		w.moveTo(0,0);
	}

        public String toString() {
            return "T " + x + " " + y + " " + s;
        }
}
