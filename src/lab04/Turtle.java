import se.lth.cs.ptdc.window.SimpleWindow;

public class Turtle {
	protected SimpleWindow w;
	private double x;
	private double y;
	private double alpha = Math.toRadians(90);
	private boolean penDown = false;

	/**
	 * Skapar en sköldpadda som ritar i ritfönstret w. Från början befinner sig
	 * sköldpaddan i punkten x,y med pennan lyft och huvudet pekande rakt uppåt
	 * i fönstret (i negativ y-riktning)
	 */
	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.x = x;
		this.y = y;
		w.moveTo(x, y);
	}

	/** Sänker pennan */
	public void penDown() {
		penDown = true;
	}

	/** Lyfter pennan */
	public void penUp() {
		penDown = false;
	}

	/** Går rakt framåt n pixlar i den riktning som huvudet pekar */
	public void forward(int n) {
		w.moveTo((int)x,(int)y);
		x = x + n * Math.cos(alpha);
		y = y - n * Math.sin(alpha);
		if (penDown) {
			w.lineTo((int) Math.round(x), (int) Math.round(y));
		} else {
			w.moveTo((int) Math.round(x), (int) Math.round(y));

		}
	}

	/** Vrider beta grader åt vänster runt pennan */
	public void left(int beta) {
		alpha = alpha + Math.toRadians(beta);
	}

	/**
	 * Går till punkten newX,newY utan att rita. Pennans läge (sänkt eller lyft)
	 * och huvudets riktning påverkas inte
	 */
	public void jumpTo(int newX, int newY) {
		x = newX;
		y = newY;
		w.moveTo((int) x, (int) y);
	}

	/** Återställer huvudriktningen till den ursprungliga */
	public void turnNorth() {
		alpha = Math.toRadians(90);
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position */
	public int getX() {
		return (int) Math.round(x);
	}

	/** Tar reda på y-koordinaten för sköldpaddans aktuella position */
	public int getY() {
		return (int) Math.round(y);
	}

	/** Tar reda på sköldpaddans riktning, i grader från positiv x-led */
	public int getDirection() {
		return (int) Math.round(Math.toDegrees(alpha));
	}
}
