package reversestring;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static String Reverse (String str) {


        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;


        //return new StringBuilder(str).reverse().toString();

        /*
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i<str.length(); i++) {
          stack.push(str.charAt(i));
        }
        String reverse = "";
        for(int i = 0; i<str.length(); i++) {
            reverse += stack.pop();
        }
        return reverse;

         */

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write the word to get reverse : ");
        System.out.println(Reverse(scanner.nextLine()));
    }
}
