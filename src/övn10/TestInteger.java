import java.util.Scanner;

public class TestInteger {
	public static void main(String[] args) {
		System.out.println("Skriv: ");
		Scanner scan = new Scanner(System.in);
		String indata = scan.next();
		Jnteger i = new Jnteger(); 
		System.out.println("Integer: " + i.parseInt(indata));
	}
}
