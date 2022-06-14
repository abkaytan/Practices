package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class endoffile {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            Boolean bo = sc.hasNext();
            int n = 1;

            while(bo) {
                String st = sc.nextLine();
                System.out.println(n+ " " + st);
                n++;
                bo = sc.hasNext();
            }

        }

}
