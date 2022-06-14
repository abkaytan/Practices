package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializator {

    static int B;
    static int H;
    static boolean flag = false;

    static {
        Scanner numb = new Scanner(System.in);
        B = numb.nextInt();
        H = numb.nextInt();
        if (B >0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
