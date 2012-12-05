import se.lth.cs.ptdc.images.ImageFilter;
import se.lth.cs.ptdc.images.ImageGUI;

public class ImageProcessor {
	public static void main(String[] args) {
		ImageFilter[] filters = new ImageFilter[5];
		filters[0] = new IdentityFilter("Identity Filter");
		filters[1] = new BlueFilter("Blue Filter");
		filters[2] = new InvertFilter("Invert Filter");
		filters[3] = new GreyScaleFilter("Grey Scale Filter");
		filters[4] = new ContrastFilter("Contrast Filter");
		new ImageGUI(filters);
	}
}
