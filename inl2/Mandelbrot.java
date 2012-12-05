import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Mandelbrot {
	public static void main(String[] args) {
		MandelbrotGUI gui = new MandelbrotGUI();
		Generator g = new Generator();
		boolean rendered = false;

		while (true) {
			// Main-loopen, väntar på kommando från användaren.
			int command = gui.getCommand();

			switch (command) {
			case MandelbrotGUI.RENDER:
				// Rendera bilden.
				g.render(gui);
				rendered = true;
				break;
			case MandelbrotGUI.RESET:
				// Återställ bilden.
				gui.resetPlane();
				gui.clearPlane();
				rendered = false;
				break;
			case MandelbrotGUI.QUIT:
				// Avsluta programmet.
				System.exit(0);
				break;
			case MandelbrotGUI.ZOOM:
				// Zooma intervallet.
				if (rendered) {
					gui.clearPlane();
					g.render(gui);
				} else {
					gui.resetPlane();
				}
				break;
			}
		}
	}
}
