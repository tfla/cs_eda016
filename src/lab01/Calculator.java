import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Skriv två tal");
		Scanner scan = new Scanner(System.in);
		int nbr1 = scan.nextInt();
		int nbr2 = scan.nextInt();
		int sum = nbr1 + nbr2;
		int dif = nbr1 - nbr2;
		int quo = nbr1 / nbr2;
		int rst = nbr1 % nbr2;
		int pro = nbr1 * nbr2;
		System.out.println("Summan av talen är " + sum
				+ "\nSkillnaden mellan talen är " + dif
				+ "\nKvoten av talen är " + quo + "." + rst
				+ "\nProdukten av talen är " + pro);
	}
}
