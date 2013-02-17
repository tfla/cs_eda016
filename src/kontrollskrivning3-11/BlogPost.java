import java.util.ArrayList;

public class BlogPost {
	private String title;
	private String text;
	private String date;
	private ArrayList<String> tags;

	public BlogPost(String title, String text, String date){
		this.title = title;
		this.tezt = text;
		this.date = date;
		tags = new ArrayList<String>();
	}

	public addTag(String tag) {
		tags.add(tag);
	}

	boolean allTagsMatch(ArrayList<String> words) {
		int counter = 0;
		
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);

			for (int j = 0; j < tags.size(); j++) {
				if (tags.get(j).equals(word)) {
					counter++;
				}
			}
		}
		
		return counter == words.size();
	}

	public String toString() {
		return title + " " + date + "\n" + text;
	}
}
