import java.util.ArrayList;
import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.ptdc.window.SimpleWindow;

public class ShapeList {
	private ArrayList<Shape> shapes;

	/**
	 * Skapar en tom lista.
	 */
	public ShapeList() {
		shapes = new ArrayList<Shape>();
	}

	/**
	 * Lägger in en figur i listan.
	 * 
	 * @param s
	 *            figuren som ska läggas in i listan
	 */
	public void insert(Shape s) {
		shapes.add(s);
	}

	/**
	 * Ritar upp figurerna i listan.
	 * 
	 * @param w
	 *            fönstret där figurerna ritas
	 */
	public void draw(SimpleWindow w) {
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).draw(w);
		}
	}

	/**
	 * Tar reda på en figur som ligger nära punkten xc,yc. Om flera figurer
	 * ligger nära så returneras den första som hittas, om ingen figur ligger
	 * nära returneras null.
	 * 
	 * @param xc
	 *            x-koordinaten
	 * @param yc
	 *            y-koordinaten
	 */
	public Shape findHit(int xc, int yc) {
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).near(xc, yc)) {
				return shapes.get(i);
			}
		}
		return null;
	}

	/**
	 * Tar reda på hur många element som ligger i listan shapes.
	 * 
	 * @return storleken på listan
	 */
	public int size() {
		return shapes.size();
	}
}
