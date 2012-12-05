import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.io.PrintWriter;
import se.lth.cs.ptdc.window.SimpleWindow;

//import se.lth.cs.ptdc.shapes.ShapeList;

public class ShapeTest {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "ShapeTest");
		ShapeList shapes = new ShapeList();
		Scanner scan = null;

		try {
			scan = new Scanner(new File("shapedata.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Filen shapedata.txt kunde inte läsas.");
			System.exit(1);
		}

		while (scan.hasNext()) {
			String s = scan.next();

			if (s.equals("S")) {
				shapes.insert(new Square(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
			} else if (s.equals("T")) {
				shapes.insert(new Triangle(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
			} else if (s.equals("C")) {
				shapes.insert(new Circle(scan.nextInt(), scan.nextInt(), scan
						.nextInt()));
			} else {
				System.err.println("Filen är förmodligen korrupt.");
				System.exit(1);
			}
		}
		shapes.draw(w);
		CommandDispatcher d = new CommandDispatcher(w, shapes);
		d.mainLoop();
	}
}
