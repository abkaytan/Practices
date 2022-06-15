package hackerrank;

import java.io.*;
import java.util.*;

public class StringTokensSplit {
    public static String remover(String sres) {
        int i;
        for (i = 0; i < sres.length(); i++) {
            if (Character.isLetter(sres.charAt(i))) {
                break;
            }
        }
        return sres.substring(i);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = remover(s);

        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        String[] words = s.split("[^a-zA-Z]+");

        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }


}
