package hackerrank;

import java.io.*;
import java.util.*;

public class Arraylist2D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int r=0; r<n ; r++){
            int k = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int c=0; c<k ; c++){
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        int q = scan.nextInt();
        for (int l=0; l<q; l++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            ArrayList<Integer> qArrayList = lists.get(i-1);
            if(j<=qArrayList.size()){
                System.out.println(qArrayList.get(j-1));
            } else {System.out.println("ERROR!");}
        }

    }
}
