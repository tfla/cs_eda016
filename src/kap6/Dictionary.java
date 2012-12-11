import java.util.ArrayList;

public class Dictionary {
	private ArrayList<String> word;	

	public Dictionary() {
		word = new ArrayList<String>();
	}

	public String getWord(int n){
		return word.get(n);
	}

	public int getNbrWords() {
		return word.size();
	}
}
