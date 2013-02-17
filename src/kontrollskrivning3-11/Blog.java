import java.util.ArrayList;

public class Blog {
	private ArrayList<BlogPost> posts;
	
	public Blog() {
		posts = new ArrayList<BlogPost>();
	}

	public ArrayList<BlogPost> getMatchingPosts(ArrayList<String> words) {
		ArrayList<BlogPost> mathingPosts = new ArrayList<BlogPost>();	
	
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i).allTagsMatch(words)) {
				matchingPosts.add(posts.get(i));
			}
		}

		return matchingPosts;
	}
}
