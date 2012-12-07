import java.util.Scanner;
import java.lang.NumberFormatException;

public class Jnteger { 
	public Jnteger() {

	}

	public int parseInt(String s) {
		Scanner scan = new Scanner(s);
		int sum = 0;
		int c = 0;
		int mp = +1;

		if (s == null) {
			throw new NumberFormatException();
		}

		if (s.charAt(c) == '-' && s.length() > 1) {
			mp = -1;
			c++;
		}
		
		if (s.length() == 0) {
			throw new NumberFormatException();
		}

		for (int i = c; i < s.length(); i++) {	
			if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
				sum = 10*sum+(s.charAt(i)-'0');
				//c++;
			}
			else {
				throw new NumberFormatException();
			}
		}
		return mp*sum;
	}
}
