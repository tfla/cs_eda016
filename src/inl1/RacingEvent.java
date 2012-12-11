import java.util.Random;
import se.lth.cs.ptdc.window.SimpleWindow;

public class RacingEvent {
	/*
	 * Skapar ett RacingEvent-objekt där loppet körs.
	 */
	private RaceTrack track;
	private Turtle t1, t2;
	
	RacingEvent(RaceTrack track, Turtle t1, Turtle t2){
		/*
		 * Konstruktor för RacingEvent-objektet.
		 */
		this.track = track;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	void startRace(SimpleWindow w){
		/*
		 * Starta loppet, utvärdera även vilket Turtle-objekt som vinner.
		 */
		Random rand = new Random();
		t1.penDown();
		t2.penDown();
		while (t1.getY() > track.getFinish() && t2.getY() > track.getFinish()){
			t1.forward(rand.nextInt(2));
			t2.forward(rand.nextInt(2));
			SimpleWindow.delay(10);
		}
		if (t1.getY() > t2.getY()){
			track.announceWinner(t2, w);
		}
		else if (t2.getY() > t1.getY()){
			track.announceWinner(t1, w);
		}
		else 
		{
			track.announceWinner(null, w);
		}
	}

}
