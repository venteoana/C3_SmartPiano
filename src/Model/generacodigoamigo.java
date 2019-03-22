package Model;
import java.math.BigInteger;
import java.security.SecureRandom;

public class generacodigoamigo {

    public static String generacodigoamigo() {
        SecureRandom random = new SecureRandom();
        String text = new BigInteger(36, random).toString(32);
        System.out.println("Tu codigo amigo es:");
        System.out.println(text);
        return (text);
    }
}