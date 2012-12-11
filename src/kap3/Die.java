import java.util.Random;

public class Die {
	int result = 0;
	
	public Die() {

	}

	public void roll() {
		Random rand = new Random();
		result = rand.nextInt(6)+1;
	}
	
	public int getResult() {
		return result;
	}
}
