import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

public class ContrastFilter extends ImageFilter {
	public ContrastFilter(String name) {
		super(name);
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		short[][] intensity = computeIntensity(inPixels);
		int[] histogram = new int[256];
		for (int i = 0; i < intensity.length; i++) {
			for (int j = 0; j < intensity[i].length; j++) {
				histogram[intensity[i][j]]++;
			}
		}

		double cutOff = paramValue / 100;
		int sum = 0;
		int lowCut = 0;
		while (lowCut < histogram.length && sum < (cutOff * (height * width))) {
			sum += histogram[lowCut];
			lowCut++;
		}

		sum = 0;
		int highCut = 255;
		while (highCut > 0 && sum < (cutOff * (height * width))) {
			sum += histogram[highCut];
			highCut--;
		}

		Color[] grayLevels = new Color[256];
		for (int i = 0; i < 256; i++) {
			grayLevels[i] = new Color(i, i, i);
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int newIntensity = 0;
				if (intensity[i][j] <= lowCut) {
					newIntensity = 0;
				} else if (intensity[i][j] >= highCut) {
					newIntensity = 255;
				} else {
					newIntensity = 255 * (intensity[i][j] - lowCut)
							/ (highCut - lowCut);
				}
				outPixels[i][j] = grayLevels[newIntensity];
			}
		}
		return outPixels;
	}
}
