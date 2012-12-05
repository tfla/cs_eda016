import java.awt.Color;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Generator {
	public void render(MandelbrotGUI gui) {
		gui.disableInput(); // Förhindra avbrott från användaren.
		Complex[][] complex = mesh(gui.getMinimumReal(), gui.getMaximumReal(),
				gui.getMinimumImag(), gui.getMaximumImag(), gui.getWidth(),
				gui.getHeight()); // Skapa matrisen för de komplexa talen.
		int pixelSize = 1; // Variabel för upplösningen.
		int MAX_ITER = 200;
		int count = 0;
		Color[] colorScale = new Color[MAX_ITER + 1];

		for (int i = 0; i < MAX_ITER; i++) {
			colorScale[i] = new Color(i, i, i+55); // Beräknar färgen för
														// varje
														// iteration.
		}

		switch (gui.getResolution()) {
		// Switch-case sats för att bestämma upplösningen.
		case MandelbrotGUI.RESOLUTION_VERY_HIGH:
			pixelSize = 1;
			break;
		case MandelbrotGUI.RESOLUTION_HIGH:
			pixelSize = 3;
			break;
		case MandelbrotGUI.RESOLUTION_MEDIUM:
			pixelSize = 5;
			break;
		case MandelbrotGUI.RESOLUTION_LOW:
			pixelSize = 7;
			break;
		case MandelbrotGUI.RESOLUTION_VERY_LOW:
			pixelSize = 9;
			break;
		}

		Color[][] picture = new Color[gui.getHeight() / pixelSize][gui
				.getWidth() / pixelSize]; // Bildmatrisen.

		for (int i = 0; i < complex.length / pixelSize; i++) {
			for (int j = 0; j < complex[i].length / pixelSize; j++) {
				Complex c = complex[i * pixelSize + pixelSize / 2][j
						* pixelSize + pixelSize / 2];
				Complex z = new Complex(0, 0);

				while (count < MAX_ITER && z.getAbs2() <= 4) {
					z.mul(z);
					z.add(c);
					count++;
				}

				switch (gui.getMode()) {
				case MandelbrotGUI.MODE_COLOR:
					if (count < MAX_ITER) {
						picture[i][j] = colorScale[count];
					} else {
						picture[i][j] = Color.WHITE;
					}
					break;
				case MandelbrotGUI.MODE_BW:
					if (z.getAbs2() <= 4) {
						picture[i][j] = Color.BLACK;
					} else {
						picture[i][j] = Color.WHITE;
					}
				}
				count = 0;
			}
		}

		/*
		 * for (int i = 0; i < complex.length / pixelSize; i++) { // Bestäm färg
		 * på pixeln på plats [i][j] i bildmatrisen.
		 * 
		 * Om vi vill rita en cirkel, kommentera bort detta. for (int j = 0; j <
		 * complex[i].length / pixelSize; j++) {
		 * 
		 * double re = complex[i * pixelSize + pixelSize / 2][j pixelSize +
		 * pixelSize / 2].getRe(); double im = complex[i * pixelSize + pixelSize
		 * / 2][j pixelSize + pixelSize / 2].getIm(); double abs = complex[i *
		 * pixelSize + pixelSize / 2][j pixelSize + pixelSize / 2].getAbs2();
		 * 
		 * 
		 * if (abs > 1) { picture[i][j] = Color.WHITE; } else { if (im > 0 && re
		 * > 0) { picture[i][j] = Color.RED; } else if (im > 0 && re < 0) {
		 * picture[i][j] = Color.BLUE;
		 * 
		 * } else if (im < 0 && re < 0) { picture[i][j] = Color.GREEN; } else if
		 * (im < 0 && re > 0) { picture[i][j] = Color.BLACK; } } }
		 * 
		 * } }
		 */
		// Rita upp bilden och ge användaren åter kontroll över programmet.
		gui.putData(picture, pixelSize, pixelSize);
		gui.enableInput();
	}

	private Complex[][] mesh(double minRe, double maxRe, double minIm,
			double maxIm, int width, int height) {
		// Generera komplexa tal till matrisen.
		Complex[][] complex = new Complex[height][width];

		for (int i = 0; i < complex.length; i++) {
			for (int j = 0; j < complex[i].length; j++) {
				double x = minRe + (-minRe + maxRe) / (width - 1) * j;
				double y = maxIm - (-minIm + maxIm) / (height - 1) * i;
				complex[i][j] = new Complex(x, y);
			}
		}
		return complex;
	}
}
