import java.util.Random;

public class Crypto {
    public Crypto() {
    
    }

    public static String encrypt(String plainText, long key) {
        Random rand = new Random(key);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int encVal = (plainText.charAt(i) + rand.nextInt(256))%256;
            sb.append((char)encVal);
        }
        return sb.toString();
    }

    public static String decrypt(String plainText, long key) {
        Random rand = new Random(key);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            int decVal = (plainText.charAt(i) - rand.nextInt(256)+256)%256;
            sb.append((char)decVal);
        }
        return sb.toString();
    }
}
