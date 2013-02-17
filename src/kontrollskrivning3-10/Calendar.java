public class Calendar {
	String name;
	private ArrayList<Event> events;

	public Calendar(String name) {
		this.name = name;
		events = new ArrayList<Event>();
	}

	public getName() {
		return name;
	}

	public boolean isFree(String date, int startTime, int finishTime) {
		int c = 0;
		while (c < events.size() && !events.get(c).getDate().equals(date)) {
			c++
		}
		
		for (int i = c; i < events.size(); i++) {
				
		}
	}
}
