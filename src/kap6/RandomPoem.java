import java.util.Random;

public class RandomPoem {
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		Random rand = new Random();

		for (int i = 0; i < 3; i++) {
			int words = 3 + rand.nextInt(8);
			for (int j = 0; j < words; j++) {
				int n = rand.nextInt(dict.getNbrWords());
				System.out.print(dict.getWord(n) + " ");
			}
			System.out.println();
		}
	}
}
