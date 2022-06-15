package hackerrank;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuilder bsb = new StringBuilder(b);
        Boolean end = false;

        System.out.println(bsb.length());
        System.out.println(b.length());

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < bsb.length(); j++) {
                    if (bsb.charAt(j) == a.charAt(i)) {
                        bsb.deleteCharAt(j);
                        break;
                    }
                }
                if (bsb.length() == 0) {
                    end = true;
                }
            }

        } else {
            return false;
        }

        return end;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
