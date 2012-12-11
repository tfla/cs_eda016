import java.util.Scanner;

public class TestWordCounter {
    public static void main(String[] args) {
        System.out.println("Skriv strängen vars ord ska räknas.");
        Scanner scan = new Scanner(System.in);
        String indata = scan.nextLine();
        WordCounter c = new WordCounter();
        int words = c.countWords(indata);
        System.out.println("Strängen innehåller " + words + " ord.");
    }
}
