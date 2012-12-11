public class Clock {
	private int hours;
	private int minutes;

	public Clock () {
		hours = 0;
		minutes = 0;
	}

	public void tick() {
		minutes++;
		if (minutes == 60) {
			minutes = 0;
			hours++;
		}
	}

	public void print() {
		if (hours < 10) {
			System.out.print("0");
		}
		System.out.print(hours + ":");
		if (minutes < 10) {
			System.out.print("0");
		}
		System.out.print(minutes);
	}
}
