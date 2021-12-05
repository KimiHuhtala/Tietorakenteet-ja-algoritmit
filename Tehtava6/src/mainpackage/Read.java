package mainpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Kimi Huhtala
 */

public class Read {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static String row() {
        String value = null;
        boolean ok;
        do {
            try {
                value = stdin.readLine();
                ok = true;
            } catch (Exception e) {
                System.out.println("Virhe. Anna uusi arvo.");
                ok = false;
            }
        }
        while (!ok);
        return value;
    }

    public static int readInt() {
        int value = -1;
        boolean ok;
        do {
            try {
                value = Integer.parseInt(stdin.readLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("Virhe. Anna uusi arvo.");
                ok = false;
            }
        }
        while (!ok);
        return value;
    }

    public static double readDouble() {
        double value = -1;
        boolean ok;
        do {
            try {
                value = Double.parseDouble(stdin.readLine());
                ok = true;
            } catch (Exception e) {
                System.out.println("Virhe. Anna uusi arvo.");
                ok = false;
            }
        }
        while (!ok);
        return value;
    }

    public static char character() {
        String row = row();
        try {
            return row.charAt(0);
        } catch (Exception e) {
            return ' ';
        }
    }
}