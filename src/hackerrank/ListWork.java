package hackerrank;

import java.io.*;
import java.util.*;

public class ListWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Integer> L = new ArrayList<Integer>();

        while (n-- != 0) {
            L.add(scan.nextInt());
        }
        int q = scan.nextInt();
        scan.nextLine();

        while (q-- != 0) {

            /*switch (s) {
                case "Insert":
                    int w = scan.nextInt();
                    int h = scan.nextInt();
                    L.add(w, h);

                case "Delete":
                    int k = scan.nextInt();
                    L.remove(k);
            }*/
            String s = scan.next();
            if(s.equals("Insert")){
                int w=scan.nextInt();
                int h=scan.nextInt();
                L.add(w, h);
            } else if(s.equals("Delete")){
                int k=scan.nextInt();
                L.remove(k);
            } else {
                System.out.println("noluyo yaw");
            }
        }
        /*System.out.println(L);*/
        for(Integer number : L) {
            System.out.print(number+" ");
        }
    }
}
