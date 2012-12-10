public class Month {
	public Month() {
	
	}

	public static int daysInMonth(int month) {
		int nbrOfDays;
		switch (month) {
			case 2: nbrOfDays = 28; break;
			case 4:
			case 6:
			case 9:
			case 11: nbrOfDays = 30; break;
			default: nbrOfDays = 31; break;
		}
		return nbrOfDays;
	}
}
