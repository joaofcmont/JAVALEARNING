import org.junit.Test;

import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println(upndown("javascript"));
        System.out.println(upndown("exam!ple"));

    }


    public static String upndown(String s) {

        StringBuilder result = new StringBuilder();
        boolean upper = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (upper) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                upper = !upper;
            } else {
                throw new IllegalArgumentException("Input contais invalid characters " + c);
            }
        }
        return result.toString();

    }

    @Test
    public void testValidStrings() {
        assertEquals("JaVaScRiPt",upndown("javascript"));
        assertEquals("JavA",upndown("java"));
    }
}
