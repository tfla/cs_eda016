import se.lth.cs.ptdc.window.SimpleWindow;

public class RaceTrack {
	/*
	 * Skapar ett RaceTrack-objekt för loppet att köras i.
	 */
	private int yStart, yFinish;

	RaceTrack(int yStart, int yFinish) {
		/*
		 * Konstruktor för RaceTrack-objektet.
		 */
		this.yStart = yStart;
		this.yFinish = yFinish;
	}

	void draw(SimpleWindow w) {
		/*
		 * Ritar upp kapplöpningsbanan i SimpleWindow-objektet.
		 */
		w.moveTo(0, yStart);
		w.lineTo(w.getWidth(), yStart);
		w.moveTo(0, yFinish);
		w.lineTo(w.getWidth(), yFinish);
		w.moveTo(0, yFinish - 10);
		w.writeText("Finish");
		w.moveTo(0, yStart + 20);
		w.writeText("Start");
		w.moveTo(200, yStart + 20);
		w.writeText("Track 1");
		w.moveTo(300, yStart + 20);
		w.writeText("Track 2");
	}

	int getFinish() {
		/*
		 * Returnerar y-värdet för mållinjen, 
		 * för att kunna avgöra vilket Turtle-objekt som vunnit.
		 */
		return yFinish;
	}

	void announceWinner(Turtle t, SimpleWindow w) {
		/*
		 * Skriver ut vilket Turtle-objekt som vunnit.
		 */
		int track = t.getX();
		if (track == 200) {
			w.moveTo(100, 250);
			w.writeText("Turtle 1 wins!");
		} else if (track == 300) {
			w.moveTo(100, 250);
			w.writeText("Turtle 2 wins!");
		} else {
			w.moveTo(100, 250);
			w.writeText("It's a draw!");
		}
	}
	void reset(SimpleWindow w, Turtle t1, Turtle t2){
		/*
		 * Nollställer SimpleWindow-objektet och Turtle-objekten,
		 * för att underlätta vid körning av fler lopp än ett.
		 */
		w.clear();
		t1.penUp();
		t2.penUp();
		t1.jumpTo(200, 400);
		t2.jumpTo(300, 400);
	}
}
