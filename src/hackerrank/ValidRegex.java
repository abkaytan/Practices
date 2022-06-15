package hackerrank;

import java.util.Scanner;
import java.util.regex.*;

public class ValidRegex {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();
        while (testCases > 0) {

            String pattern = in.nextLine();
            //Write your code

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }

}
