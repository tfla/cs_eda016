import java.util.Scanner;

public class WordCounter {
    public WordCounter() {
        
    }
    public int countWords(String s) {
        int c = 0;
        Scanner scan = new Scanner(s);

        while (scan.hasNext()) {
            String word = scan.next();
            c++;
        }
        return c;
    }
}
