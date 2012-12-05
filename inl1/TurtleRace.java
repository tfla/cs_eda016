
import se.lth.cs.ptdc.window.SimpleWindow;

public class TurtleRace {
	public static void main(String[] args) {
		/*
		 * Kör loppet.
		 */
		RaceTrack track = new RaceTrack(400, 100);
		SimpleWindow w = new SimpleWindow(500, 500, "TurtleRace");
		Turtle t1 = new Turtle(w, 200, 400);
		Turtle t2 = new Turtle(w, 300, 400);
		RacingEvent event = new RacingEvent(track, t1, t2);
		track.draw(w);
		while (true) {
			w.waitForMouseClick();
			track.reset(w, t1, t2);
			track.draw(w);
			event.startRace(w);
		}

	}
}