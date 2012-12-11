import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

public class GreyScaleFilter extends ImageFilter {
	public GreyScaleFilter(String name) {
		super(name);
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		short[][] intensity = computeIntensity(inPixels);	
		Color[] grayLevels = new Color[256];
		for (int i = 0; i < 256; i++){
			grayLevels[i] = new Color(i, i, i);
		}
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j++){
				int intensityNbr = intensity[i][j];
				outPixels[i][j] = grayLevels[intensityNbr];
			}
		}
		return outPixels;
	}
}