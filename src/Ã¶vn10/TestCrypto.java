import java.util.Scanner;

public class TestCrypto {
    public static void main(String[] args) {
        Crypto c = new Crypto();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange strängen som ska krypteras.");
        String indata = scan.next();
        long key = 12345;
        String encrypted = c.encrypt(indata, key);
        System.out.println("Krypterad text: " + encrypted);
		String decrypted = c.decrypt(encrypted, key);
        System.out.println("Dekrypterad text: " + decrypted);
    }
}
